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

    <!-- Begin Page Content -->
    <div style="width: 100%">
      <!-- Topbar -->
      <nav
          class="
          navbar navbar-expand navbar-light
          bg-gradient-primary2
          topbar
          static-top
          shadow
        "
      >
        <!-- Topbar Navbar -->
        <ul class="navbar-nav">
          <li class="nav-item">
            <router-link
                to="/basic"
                class="nav-link mr-5 text-white"
                id="navbarDropdownMenuLink"
                aria-haspopup="true"
                aria-expanded="false"
            >
              체중관리
            </router-link>
          </li>
          <li class="nav-item">
            <router-link
                to="/diet"
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
      <div class="container-fluid" id="page-top">
        <!-- Page Heading -->
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
                  <h6 v-if="user.gender==F" class="m-0 font-weight-bold text-primary float-right">
                    기초대사량 : {{ mBmr }} kcal
                  </h6>
                  <h6 v-else class="m-0 font-weight-bold text-primary float-right">
                    기초대사량 : {{ wBmr }} kcal
                  </h6>
                </h6>
              </div>
              <div class="card-body text-center">
                <h2>{{ mAmr }}</h2>
<!--                <h2 v-if="user.gender=='F'">{{ mAmr }}</h2>-->
<!--                <h2 v-else>{{ wAmr }}</h2>-->

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
                      <b-progress-bar
                          variant="primary"
                          :value="values[0]"
                          animated
                          show-progress
                      >
                        <div>탄</div>
                      </b-progress-bar>
                      <b-progress-bar
                          variant="success"
                          :value="values[1]"
                          animated
                          show-progress
                      >
                        <div>단</div>
                      </b-progress-bar>
                      <b-progress-bar
                          variant="info"
                          :value="values[2]"
                          animated
                          show-progress
                      >
                        <div>지</div>
                      </b-progress-bar>
                    </b-progress>
                    <div id="chart">
                      <apexchart type="bar" height="350" :options="chartOptions" :series="series"></apexchart>
                    </div>
                  </div>

                  <strong class="tit">Kcal</strong>
                  <!--                  <div class="graph">-->
                  <!--                    &lt;!&ndash; 기준 &ndash;&gt;-->
                  <!--                    <ul class="y-axis">-->
                  <!--                      <li><span>1000</span></li>-->
                  <!--                      <li><span>850</span></li>-->
                  <!--                      <li><span>700</sp an></li>-->
                  <!--                      <li><span>550</span></li>-->
                  <!--                      <li><span>300</span></li>-->
                  <!--                      <li><span>150</span></li>-->
                  <!--                      <li><span>0</span></li>-->
                  <!--                    </ul>-->

                  <!--                    &lt;!&ndash; 목록 &ndash;&gt;-->
                  <!--                    <ul class="x-axis">-->
                  <!--                      <li><span>탄수화물</span></li>-->
                  <!--                      <li><span>단백질</span></li>-->
                  <!--                      <li><span>지방</span></li>-->
                  <!--                    </ul>-->

                  <!--                    &lt;!&ndash; 바 그래프 (백분율 만큼 heigh값) &ndash;&gt;-->
                  <!--                    <ul class="bar">-->
                  <!--                      <li style="height: 100%"><span></span></li>-->
                  <!--                      <li style="height: 70%"><span></span></li>-->
                  <!--                      <li style="height: 30%"><span></span></li>-->
                  <!--                    </ul>-->
                  <!--                  </div>-->
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

                    <tr class="add">
                      <th class="add">1</th>
                      <th class="add">1</th>
                      <th class="add">2</th>
                      <th class="add">3</th>
                    </tr>

                    <tr class="add" v-for="item in items" :key="item.title">
                      <td class="add"><span v-html="item.title"></span></td>
                      <td class="add"><span v-html="item.one1"></span></td>
                      <td class="add"><span v-html="item.one2"></span></td>
                      <td class="add"><span v-html="item.one3"></span></td>
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

        <!-- 추가하기버튼 시작 -->
        <router-link to="/foodInput">
          <button class="btn btn-primary float-right">추가하기</button>
        </router-link>
        <!-- 추가하기버튼 끝 -->
      </div>
      <div class="col-lg-8 mb-4">
        <div class="card-header py-10">

          <tr class="edd" v-for="item in bab" :key="item.title">
            <td class="title"><span v-html="item.title"></span></td>
            <td class="underscore_zero"><span v-html="item.one1"></span></td>
            <td class="underscore_one"><span v-html="item.one2"></span></td>
            <td class="underscore_two"><span v-html="item.one3"></span></td>
            <td class="underscore_three"><span v-html="item.one4"></span></td>
          </tr>

        </div>
      </div>





      <!--          아침 점심 저녁 간식 테이블-->
<!--          <div class="bab-table">-->
<!--            <div class="table-responsive">-->

<!--            <tr class="one">-->
<!--              <th class="thh">아침</th>-->
<!--              <td>0Kcal</td>-->
<!--              <td>0</td>-->
<!--              <td>0</td>-->
<!--              <td>0</td>-->
<!--            </tr>-->

<!--            <tr>-->
<!--              <th class="thh">점심</th>-->
<!--              <td>0Kcal</td>-->
<!--              <td class="carbohydrate">0</td>-->
<!--              <td class="protein">0</td>-->
<!--              <td class="Fat">0</td>-->
<!--            </tr>-->

<!--            <tr class="one">-->
<!--              <th class="thh">저녁</th>-->
<!--              <td>0Kcal</td>-->
<!--              <td>0</td>-->
<!--              <td>0</td>-->
<!--              <td>0</td>-->

<!--            </tr>-->


<!--            <tr class="one">-->
<!--              <th class="thh">간식</th>-->
<!--              <td>0Kcal</td>-->
<!--              <td>0</td>-->
<!--              <td>0</td>-->
<!--              <td>0</td>-->
<!--            </tr>-->
<!--        </div>-->
<!--      </div>-->
    </div>


<!--          아침 점심 저녁 간식 테이블 끝-->
    </div>
</template>

<script>
/*eslint-disable*/
import dayjs from "dayjs";
import VueApexCharts from 'vue-apexcharts'


export default {
  name: "food",
  components: {
    apexchart: VueApexCharts,
  },
  data:function() {
    return {
      user:[],
      wBmr:0,
      mBmr:0,
      // methods: {
      //   updateChart() {
      //     const max = 90;
      //     const min = 20;
      //     const newData = this.series[0].data.map(() => {
      //       return Math.floor(Math.random() * (max - min + 1)) + min
      //     })
      //     // In the same way, update the series option
      //     this.series = [{
      //       data: newData
      //     }]
      //   }
      // }
      // 막대 그래프
      series: [{
        name: '아침',
        data: [44, 55, 41]
      }, {
        name: '점심',
        data: [13, 23, 20]
      }, {
        name: '저녁',
        data: [11, 17, 15]
      }, {
        name: '간식',
        data: [21, 7, 25]
      },{
        name: '부족한 양' +
            '',
        data: [0, 3, 5]
      }
      ],
      chartOptions: {
        chart: {
          type: 'bar',
          height: 350,
          stacked: true,
          toolbar: {
            show: true
          },
          zoom: {
            enabled: true
          }
        },
        responsive: [{
          breakpoint: 480,
          options: {
            legend: {
              position: 'bottom',
              offsetX: -10,
              offsetY: 0
            }
          }
        }],
        plotOptions: {
          bar: {
            horizontal: false,
            borderRadius: 10,
            barHeight: '70%',
          },
        },
        xaxis: {
          type: 'category',
          categories: ['탄수화물','단백질','지방'
          ],
          labels:{
            style:{
              fontWeight: '1000',
              fontSize: '15px',
            }
          }
        },
        legend: {
          position: 'right',
          offsetY: 40,
          markers: {
            width: 12,
            height: 12,
            strokeWidth: 0,
            strokeColor: '#fff',
            fillColors: ['#4375DB', '#6799FF','#8BBDFF','#AFE1FF','#8C8C8C'],
          },
        },
        fill: {
          colors: ['#4375DB', '#6799FF','#8BBDFF','#AFE1FF','#8C8C8C'],
          opacity: 1,
        }
      },
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
      // TODO : 그래프 위 막대 그래프 수치
      values: [30, 30, 40],
      max: 100,
      //TODO : 오른쪽 테이블
      items: [
        {
          title: "탄수화물<b>비율</b>",
          one1: "추천",
          one2: "0000",
          one3: "권장 단백질 섭취량",
        },
        {
          title: "단백질<b>비율</b>",
          one1: "0000",
          one2: "0000",
        },
        {
          title: "지방 <b>조절</b>",
          one1: "0000",
          one2: "0000",
        },
        {
          title: "<b>칼로리 조절</b>",
          one1: "0000",
          one2: "0000",
        },
      ],
      bab: [
        {
          title: "아침",
          one1: "0Kcal",
          one2: "0g",
          one3: "0g",
          one4: "0g",
        },
        {
          title: "점심",
          one1: "0Kcal",
          one2: "0g",
          one3: "0g",
          one4: "0g",
        },
        {
          title: "저녁",
          one1: "0Kcal",
          one2: "0g",
          one3: "0g",
          one4: "0g",
        },
        {
          title: "간식",
          one1: "0Kcal",
          one2: "0g",
          one3: "0g",
          one4: "0g",
        },
      ],
      chartData: {
        labels: [
          '탄수화물',
          '단백질',
          '지방',

        ],
        datasets: [
          {
            label: 'Kcal',
            backgroundColor : ['rgba(54, 162, 235, 0.2)',
              'rgba(255, 159, 64, 0.2)',
              'rgba(75, 192, 192, 0.2)'],
            borderColor: [
              'rgb(54, 162, 235)',
              'rgb(255, 159, 64)',
              'rgb(75, 192, 192)'
            ],
            borderWidth: 1,
            data: [100, 90, 80,]
          }
        ]
      },
    };
  },
  methods:{
    mAmr: function () {
      this.mAmr =mBmr+1;
    },
    wAmr: function () {
      this.wAmr =wBmr+1 ;
    },
  }
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




.add{
    padding: 30px;
    border: 2px solid #ccc;
    height: 100px;
    background-color: white;

}
/*tr,td,th {
/*  padding: 30px;*/
/*  border: 2px solid #ccc;*/
/*  height: 100px;*/
/*  background-color: white;*/


/*}*/
.underscore_zero{

  width: 200px;
background-color: white;

}
.underscore_one{


  width: 200px;
  border-bottom: 5px solid skyblue;

}
.underscore_two{


  width: 200px;
  border-bottom: 5px solid #FFA500;
}
.underscore_three{


  width: 200px;
  border-bottom: 5px solid #66CDAA;
}

.edd{

  text-indent: 100px;
  background-color: white;

}
.title{
  font-weight: bold;
  text-indent: 30px;
  font-size: 20px;
}
/*.one{*/
/*  padding: 20px;*/
/*  border: none;*/
/*  height: 100px;*/
/*  background-color: white;*/
/*  line-height:0.1px;  */

/*}*/

.content {
  position: relative;
}

.carbohydrate {
 text-decoration: underline;
  text-underline-position:under;
  color: blue;

}

.thh{
  font-size: large;
}


body {
  padding: 1rem;
}
</style>