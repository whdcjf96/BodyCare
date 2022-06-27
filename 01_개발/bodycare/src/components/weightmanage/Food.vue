<template>
  <div id="wrapper" style="width: 100%">
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

    <!-- Begin Page Content -->
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
          <router-link to="/diet"
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
    <div class="container-fluid" id="page-top">

      <!-- Page Heading -->
      <!-- TODO : 현재 날짜 출력 -->
      <div class="row ">
        <div
            class="ma-0 pa-3 col col-12"
            style="
          color: #4e73df;
          font-size: 30px;
          font-weight: bold;
          text-align: center;
        ">
          <span>&lt;   </span>{{ today }}<span c>   &gt;</span>
        </div>
      </div>
      <!-- 현재 날짜 출력 끝 -->
      <!-- TODO : 내용 수정 -->
      <!-- Content Row -->
      <div class="row">
        <!-- Content Column -->
        <div class="col-lg-12 mb-4">
          <!-- Project Card Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <!-- TODO : Project -> 활동대사량 이름 수정 -->
              <h6 class="m-0 font-weight-bold text-primary">
                섭취할 칼로리
                <!-- TODO : 기초대사량 추가 -->
                <h6 class="m-0 font-weight-bold text-primary float-right">
                  기초대사량 : 0000 kcal
                </h6>
              </h6>
            </div>
            <div class="card-body text-center">
              <h2>0000</h2>

              <h6 class="float-right">kcal</h6>
              <h6 class="float-none">0000 kcal 부족</h6>
            </div>
          </div>
        </div>

        <div class="row"></div>
        <!-- TODO : 내용 수정 -->
        <div class="col-lg-8 mb-4">
          <!-- Illustrations -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">
                탄단지 비율 그래프
              </h6>


            </div>
            <div class="card-body">
              <div class="graph_wrap">

                <div>


                  <b-progress :max="max">
                    <b-progress-bar variant="primary" :value="values[0]" animated show-progress></b-progress-bar>
                    <b-progress-bar variant="success" :value="values[1]" animated show-progress></b-progress-bar>
                    <b-progress-bar variant="info" :value="values[2]" animated show-progress></b-progress-bar>
                  </b-progress>
                </div>

                <strong class="tit">Kcal</strong>
                <div class="graph">
                  <!-- 기준 -->
                  <ul class="y-axis">
                    <li><span>1000</span></li>
                    <li><span>850</span></li>
                    <li><span>700</span></li>
                    <li><span>550</span></li>
                    <li><span>300</span></li>
                    <li><span>150</span></li>
                    <li><span>0</span></li>

                  </ul>

                  <!-- 목록 -->
                  <ul class="x-axis">
                    <li><span>탄수화물</span></li>
                    <li><span>단백질</span></li>
                    <li><span>지방</span></li>
                  </ul>

                  <!-- 바 그래프 (백분율 만큼 heigh값) -->
                  <ul class="bar">
                    <li style="height: 100%"><span></span></li>
                    <li style="height: 70%"><span></span></li>
                    <li style="height: 30%"><span></span></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col-lg-4 mb-4">

          <div class="card-header py-6">

            <!--            비율 테이블  -->
            <template>
              <div>
                <table>
                  <tr>
                    <th>1</th>
                    <th>1</th>
                    <th>2</th>
                    <th>3</th>


                  </tr>
                  <tr v-for="item in items" :key="item.title">
                    <td><span v-html="item.title"></span></td>
                    <td><span v-html="item.one1"></span></td>
                    <td><span v-html="item.one2"></span></td>
                    <td><span v-html="item.one3"></span></td>
                  </tr>
                </table>
              </div>
            </template>

          </div>
          <div class="card-body">
            <!-- DataTales Example -->
            <div class="table-responsive">
              <table
                  class="table table-bordered"
                  id="dataTable"
                  width="100%"
                  cellspacing="0"
              ></table>
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
import dayjs from "dayjs";

export default {
  name: "food",
  data() {
    return {
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
      values: [15, 30, 20],
      max: 100,


      items: [
        {
          "title": "탄수화물<b>비율</b>",
          "one1": "추천",
          "one2": "0000",
          "one3": "권장 단백질 섭취량"


        },
        {
          "title": "단백질<b>비율</b>",
          "one1": "0000",
          "one2": "0000",

        },
        {
          "title": "지방 <b>조절</b>",
          "one1": "0000",
          "one2": "0000",

        },
        {
          "title": "<b>칼로리 조절</b>",
          "one1": "0000",
          "one2": "0000",

        }
      ]
    };
  },
};
</script>

<style scoped>
ul {
  list-style: none;
}

.graph_wrap {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
}

.graph_wrap .tit {
  font-size: 16px;
  font-weight: 500;
  color: #333333;
}

.graph {
  position: relative;
  height: 385px;
  margin-top: 15px;
}

.graph .y-axis {
  position: absolute;
  width: 100%;
  height: 100%;
  z-index: 1;
}

.graph .y-axis > li {
  position: relative;
  width: calc(100% - 20px);
  height: calc(100% / 8);
  margin-left: 20px;
  border-top: 1px solid #8c8c8c;
  text-align: left;
}

.graph .y-axis > li span {
  position: absolute;
  top: -7px;
  left: -20px;
  font-size: 12px;
  line-height: 1;
}

.graph .x-axis {
  position: absolute;
  display: flex;
  bottom: -14px;
  left: 20px;
  width: calc(100% - 20px);
  justify-content: space-around;
  text-align: center;
  z-index: 2;
}

.graph .x-axis > li {
  font-size: 12px;
}

.graph .bar {
  display: flex;
  position: absolute;
  left: 20px;
  bottom: 16px;
  width: calc(100% - 20px);
  height: calc(100% - 16px);
  justify-content: space-around;
  align-items: flex-end;
  text-align: center;
  z-index: 3;
}

.graph .bar > li {
  width: 100%;
}

.graph .bar > li span {
  display: inline-block;
  max-width: 80px;
  width: 100%;
  height: calc(100% + 10px);
  background: #f1cb7e;
}

.graph .bar:before {
  content: "";
  position: absolute;
  top: -2px;
  left: 3px;
  height: calc(100% + 4px);
  width: 1px;
  background: #8c8c8c;
}

td, th {
  padding: 30px;
  border: 2px solid #ccc;
  height: 100px;
  background-color: white;
}

body {
  padding: 1rem;
}


</style>