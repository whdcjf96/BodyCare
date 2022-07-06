<template>
  <!-- 화면 시작 -->
  <div class="container-fluid" id="page-top">
    <!-- 화면 바디 시작 -->
    <div class="row">
      <!-- 1번 row 시작 -->
      <div class="col-lg-6 mb-4">
        <div class="card shadow mb-4">
          <div class="card-body">
            <div class="table-responsive">
              <ul class="list-group">
                <li
                    class="list-group-item"
                    :class="{ food: index == currentIndex }"
                    v-for="(food, index) in foods"
                    :key="index"
                    @click="setActiveActivity(food, index)"
                >

                  <div>1
                    <div class="float-right">{{ food.carbohydrate }}</div>
                    <div class="float-right">{{ food.protein }}</div>
                    <div class="float-right">{{ food.fat }}</div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <!-- 1번 row 끝-->

      <!-- 2번 row 시작-->
      <div class="col-lg-6 mb-4">
        <!-- 활동창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body text-center">
            <div class="text-left">
              <h6>식품명</h6>
            </div>
            <div class="row">
              <div class="col">
                <h4>0g</h4>
              </div>
              <div class="col">
                <h4>0g</h4>
              </div>
              <div class="col">
                <h4>0g</h4>
              </div>
            </div>
          </div>
        </div>
        <!-- 활동창 끝 -->

        <!-- 시간창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body">
            <div class="text-left">
              <h6>수량</h6>
            </div>
            <div class="text-center">1</div>
            <div class="float-right">100g 기준</div>
          </div>
        </div>
        <!-- 시간창 끝 -->

        <!-- 아점저창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body">
            <ul class="navbar-nav">
              <!-- dropdown #1 시작 -->
              <li class="nav-item dropdown mr-4">
                <a
                    class="nav-link dropdown-toggle mr-5"
                    href="#"
                    id="navbarDropdownMenuLink"
                    data-toggle="dropdown"
                    aria-haspopup="true"
                    aria-expanded="false"
                >
                  식사구분
                </a>
                <div
                    class="dropdown-menu"
                    aria-labelledby="navbarDropdownMenuLink"
                >
                  <a href="#" class="dropdown-item"> 아침 </a>
                  <a href="#" class="dropdown-item"> 점심 </a>
                  <a href="#" class="dropdown-item"> 저녁 </a>
                  <a href="#" class="dropdown-item"> 간식 </a>
                </div>
              </li>
            </ul>
            <!-- dropdown #1 끝 -->
          </div>
        </div>
        <!-- 아점저창 끝 -->
      </div>
      <!-- 2번 row 끝-->
    </div>
    <!-- 화면 바디 끝 -->

    <!-- 취소버튼 -->
    <router-link to="/food">
      <button class="btn btn-danger float-left">취소</button>
    </router-link>

    <!-- 저장 후 추가 버튼 -->
    <button class="btn btn-primary float-right">저장 후 추가</button>
  </div>
</template>

<script>
import DietDataService from "@/services/DietDataService";

export default {
  name: "foodInput",
  data() {
    return {
      foods: [],
      currentFood: null,
      currentIndex: -1,
      searchTitle: "",
      page: 1,
      count: 0,
      pageSize: 3,
      pageSizes: [3, 6],
      inputFoods: {
        id: null,
        food: "",
        actTime: 0
      }
    };
  },
  methods: {
    getRequestParams(searchTitle, page, pageSize) {
      let params = {};

      // // searchTitle 값이 있으면 params객체에 title로 저장
      if (searchTitle) {
        params["diet"] = searchTitle;
      }
      // page 값이 있으면 params객체에 page 저장
      if (page) {
        params["page"] = page - 1;
      }
      // pageSize 값이 있으면 params객체에 size 저장
      if (pageSize) {
        params["size"] = pageSize;
      }

      return params;
    },
    // 모든 회원 조회 서비스 호출
    retrieveDiets() {
      const params = this.getRequestParams(
          this.searchTitle,
          this.page,
          this.pageSize
      );
      // axios로 spring에 모든 회원 조회 요청
      DietDataService.getAll(params)
          // 성공하면 then으로 서버 데이터(response.data)가 들어옴
          .then((response) => {
            const {foods, totalItems} = response.data;
            this.foods = foods; // 객체
            this.count = totalItems; // 총건수

            console.log(response.data);
          })
          // 실패하면 catch로 에러메세지가 들어옴
          .catch((e) => {
            alert(e);
          });
    },
    handlePageChange(value) {
      // 페이지번호 저장
      this.page = value;
      // 다시 데이터 조회
      this.retrieveDiets();
    },
    // 역할 : 페이지당건수가 변경되면 다시 조회하는 메소드
    handlePageSizeChange(event) {
      // 한 페이지 당 건수 저장
      this.pageSize = event.target.value; // 셀렉트박스 변경시 값 가져옴
      this.page = 1;
      // 다시 데이터 조회
      this.retrieveDiets();
    },
    refreshList() {
      this.retrieveDiets();
      this.currentDiet = null;
      this.currentDietInputs = null;
      this.currentIndex = -1;
    },

    setActiveDiet(foods, index) {
      this.currentDiet = foods;
      this.currentIndex = index;
    },
  },
};
</script>

<style>
</style>