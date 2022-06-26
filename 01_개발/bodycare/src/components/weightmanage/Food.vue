<template>
  <!-- Begin Page Content -->
  <div class="container-fluid">
    <!-- Page Heading -->
    <!-- TODO : 현재 날짜 출력 -->
    <div class="text-center">
      <h2>{{ today }}</h2>
    </div>

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
              <strong class="tit">Kcal</strong>
              <div class="graph">
                <!-- 기준 -->
                <ul class="y-axis">
                  <li><span>35</span></li>
                  <li><span>30</span></li>
                  <li><span>25</span></li>
                  <li><span>20</span></li>
                  <li><span>15</span></li>
                  <li><span>10</span></li>
                  <li><span>5</span></li>
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
        <!-- Approach -->
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">활동탬플릿</h6>
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
</template>

<script>
/*eslint-disable*/
export default {
  name: "food",
};
</script>

<style scoped>
ul{
   list-style:none;
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
  height: 185px;
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
.graph .x-axis > li{
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
</style>