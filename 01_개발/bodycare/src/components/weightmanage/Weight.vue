<template>
  <div id="wrapper" style="width: 100%">
    <div>
      <!-- Sidebar -->
      <ul
          class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
          id="accordionSidebar"
          style="height: 100%"
      >
        <!-- Sidebar - Brand -->
        <router-link
            to="/"
            class="sidebar-brand d-flex align-items-center justify-content-center"
        >
          <div class="sidebar-brand-icon ">
            <i class="fas fa-laptop-medical"></i>
          </div>
          <div class="sidebar-brand-text mx-3">Nutrition Assistant</div>
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
      bg-gradient-primary
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

          <li class="nav-item" style="position: fixed; right: 0px;">
            <router-link
                to="/login"
                class="nav-link mr-5 text-white"
                id="navbarDropdownMenuLink"
                aria-haspopup="true"
                aria-expanded="false"
            >
              로그인
            </router-link>
          </li>
          <li class="nav-item" style="position: fixed; right: 100px;">
            <router-link
                to="/mypage"
                class="nav-link mr-5 text-white"
                id="navbarDropdownMenuLink"
                aria-haspopup="true"
                aria-expanded="false"
            >
              마이페이지
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

          <!-- TODO : 현재 날짜 출력 -->
          <div class="row">
            <div
                class="ma-0 pa-3 col col-12"
                style="
              color: #4e73df;
              font-size: 30px;
              font-weight: bold;
              text-align: center;
            "
            >
              <span>&lt; </span>{{ today }}<span c> &gt;</span>
            </div>
          </div>
          <!-- 현재 날짜 출력 끝 -->

          <div class="row no-gutters align-center justify-center">


            <!-- 그래프란 -->
            <div class="card shadow mt-3 col col-12">
              <div class="card shadow mb-4">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary">체중 추적 그래프</h6>
                </div>
                <div class="card-body">
                  <div class="chart-area">
                    <!--                    -->
                    <template>
                      <LineChartGenerator
                          :chart-options="chartOptions"
                          :chart-data="chartData"
                          :chart-id="chartId"
                          :dataset-id-key="datasetIdKey"
                          :plugins="plugins"
                          :css-classes="cssClasses"
                          :styles="styles"
                          :width="width"
                          :height="height"
                      />
                    </template>
                  </div>
                </div>
              </div>

            </div>

            <!-- 체중 추세 기울기  -->
            <!-- 그래프 시작일 설정  -->
            <div class="mt-5 card shadow mt-3 col col-12">
              <div class="mt-5pa-4 ml-3  mt-2 ma-3 v-card v-card--flat v-sheet theme--light">
                <div class="v-card__title">기타 정보</div>
                <div class="box">
                  기타등등
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
import {Line as LineChartGenerator} from 'vue-chartjs/legacy'

import {
  Chart as ChartJS,
  Title,
  Tooltip,
  Legend,
  LineElement,
  LinearScale,
  CategoryScale,
  PointElement
} from 'chart.js'
import dayjs from "dayjs";
ChartJS.register(
    Title,
    Tooltip,
    Legend,
    LineElement,
    LinearScale,
    CategoryScale,
    PointElement
)
export default {
  name: "weight",
  components: { LineChartGenerator},
  props: {
    chartId: {
      type: String,
      default: 'line-chart'
    },
    datasetIdKey: {
      type: String,
      default: 'label'
    },
    width: {
      type: Number,
      default: 400
    },
    height: {
      type: Number,
      default: 400
    },
    cssClasses: {
      default: '',
      type: String
    },
    styles: {
      type: Object,
      default: () => {
      }
    },
    plugins: {
      type: Array,
      default: () => []
    }
  },
  data() {
    return {
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
      // TODO : 그래프 위 막대 그래프 수치

      chartData: {
        labels: [
          '1',
          '2',
          '3',
          '4',
          '5',
          '6',
          '8',
          '9',
          '10',
          '11',
          '12'
        ],
        datasets: [
          {
            label: '체중',
            backgroundColor: '#f87979',
            data: [100,90,80,70,80,50,60,70,80,90,100]
          }
        ]
      },
      chartOptions: {
        responsive: true,
        maintainAspectRatio: false
      },
    };
  },
};


</script>

<style scoped>
</style>