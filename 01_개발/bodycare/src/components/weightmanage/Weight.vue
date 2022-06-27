<template>
  <div id="wrapper">
    <div>
      <!-- Sidebar -->
      <ul
          class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
          id="accordionSidebar"
      >
        <!-- Sidebar - Brand -->
        <router-link
            to="/"
            class="sidebar-brand d-flex align-items-center justify-content-center"
        >
          <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-laugh-wink"></i>
          </div>
          <div class="sidebar-brand-text mx-3">Body Care</div>
        </router-link>

        <!-- TODO : Basic 라우터버튼 -->
        <!-- Nav Item - ActivityManage -->
        <li class="nav-item">
          <router-link to="/basic" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>기본</span>
          </router-link>
        </li>

        <!-- TODO : ActivityManage 라우터버튼 -->
        <!-- Nav Item - ActivityManage -->
        <li class="nav-item">
          <router-link to="/activityManage" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>활동관리</span>
          </router-link>
        </li>

        <!-- TODO : Food 라우터버튼 -->
        <!-- Nav Item - Food -->
        <li class="nav-item">
          <router-link to="/food" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>식단관리</span>
          </router-link>
        </li>

        <!-- TODO : weightHisotry 라우터버튼 -->
        <!-- Nav Item - weightHisotry -->
        <li class="nav-item">
          <router-link to="/weight" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>체중추적</span>
          </router-link>
        </li>
      </ul>
      <!-- End of Sidebar -->

    </div>
    <div style="width: 100%">
    <!-- Topbar -->
    <nav
        class="
      navbar navbar-expand navbar-light
      bg-primary
      topbar
      static-top
      shadow
    "
    >

      <!-- Topbar Navbar -->
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link to="/basic"
                       class="nav-link mr-5 text-white"
                       id="navbarDropdownMenuLink"
                       aria-haspopup="true"
                       aria-expanded="false"
          >
            체중관리
          </router-link>
        </li>
        <li class="nav-item">
          <router-link to="/DietCom"
                       class="nav-link mr-5 text-white"
                       id="navbarDropdownMenuLink"
                       aria-haspopup="true"
                       aria-expanded="false"
          >
            운동도우미
          </router-link>
        </li>
      </ul>

    </nav>
    <!-- End of Topbar -->
    <!-- 화면 전체 시작 -->
    <div class="container-fluid">
      <!-- 화면 바디 시작 -->
      <div class="basic">
        <!-- 본문 -->
        <div class="row no-gutters align-center justify-center">
          <!-- 그래프란 -->
          <div class="card shadow mt-3 col col-12">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">체중 추적 그래프</h6>
              </div>
              <div class="card-body">
                <div class="chart-area">
                  <canvas id="myAreaChart"></canvas>
                </div>
                <hr>
                Styling for the area chart can be found in the
                <code>/js/demo/chart-area-demo.js</code> file.
              </div>
            </div>

          </div>

          <!-- 체중 추세 기울기  -->
          <div class="card shadow mt-3 col col-12">
            <div class="pa-4 ml-3  mt-2 ma-3 v-card v-card--flat v-sheet theme--light">
              <div class="v-card__title">체중 추세 기울기: 0 Kg</div>
              <div class="mt-2 mb-3 v-card__text font-weight-bold"> 다이어트 추천, 상승다이어트 가능하나, 식단, 운동 노력이 상당히 필요.
              </div>
            </div>
          </div>
          <!-- 그래프 시작일 설정  -->
          <div class="card shadow mt-3 col col-12">
            <div class="pa-4 ml-3  mt-2 ma-3 v-card v-card--flat v-sheet theme--light">
              <div class="v-card__title">그래프 시작일 설정</div>
            </div>
          </div>
          <!-- 개별 입력  -->
          <div class="card shadow mt-3 col col-12">
            <div class="pa-4 ml-3  mt-2 ma-3 v-card v-card--flat v-sheet theme--light">
              <div class="v-card__title">개별 입력</div>
              <div class="mt-2 mb-3 v-card__text font-weight-bold"> 이미 값이 존재하는 경우, 새 값으로 갱신됩니다.
              </div>
            </div>
          </div>


        </div>

      </div>
    </div>
  </div>
  </div>
</template>
<script>

/*eslint-disable*/
export default {

  name: "weight",
};

</script>

<style scoped>
</style>