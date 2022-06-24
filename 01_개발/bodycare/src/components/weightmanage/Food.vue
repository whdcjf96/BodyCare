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
            <div class="chart-bar">
              <canvas id="myBarChart"></canvas>
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
import "../../assets/js/demo/chart-bar-demo"
/*eslint-disable*/
export default {
  name: "food",
};
</script>

<style scoped>
</style>