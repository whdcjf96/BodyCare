<template>
  <div>
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
                활동대사량
                <!-- TODO : 기초대사량 추가 -->
                <h6 class="m-0 font-weight-bold text-primary float-right">
                  기초대사량 : 0000 kcal
                </h6>
              </h6>
            </div>
            <div class="card-body text-center">
              <h2>0000</h2>
              <h6 class="float-right">kcal</h6>
            </div>
          </div>
        </div>

        <div class="row"></div>
        <!-- TODO : 내용 수정 -->
        <div class="col-lg-8 mb-4">
          <!-- Illustrations -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <!-- TODO : Illustrations -> 총 활동 0 시간(24시간 기준) 이름 수정 -->
              <h6 class="m-0 font-weight-bold text-primary">
                총 활동 0 시간(24시간 기준)
              </h6>
              <h6 class="m-0 font-weight-bold text-primary">
                활동 정보 24시간 부족
              </h6>
            </div>
            <div class="card-body">
              <!-- DataTales Example -->
              <div class="table-responsive">
                <table
                  class="table table-bordered"
                  id="dataTable"
                  width="100%"
                  cellspacing="0"
                >
                  <thead>
                    <tr>
                      <th>Name</th>
                      <th>Time</th>
                      <th>활동강도</th>
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>Name</th>
                      <th>Time</th>
                      <th>활동강도</th>
                    </tr>
                  </tfoot>
                  <tbody>
                    <tr>
                      <td>빈둥빈둥</td>
                      <td>24hr</td>
                      <td>1.4</td>
                    </tr>
                    <tr>
                      <td>좌식업무</td>
                      <td>24hr</td>
                      <td>1.5</td>
                    </tr>
                    <tr>
                      <td>돌아다니는 업무</td>
                      <td>24hr</td>
                      <td>1.75</td>
                    </tr>
                    <tr>
                      <td>활동적인 업무</td>
                      <td>24hr</td>
                      <td>1.75</td>
                    </tr>
                    <tr>
                      <td>일반 직장인</td>
                      <td>24hr</td>
                      <td>1.75</td>
                    </tr>
                    <tr>
                      <td>휴일 직장인</td>
                      <td>24hr</td>
                      <td>1.75</td>
                    </tr>
                  </tbody>
                </table>
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
                >
                  <thead>
                    <tr>
                      <th>Name</th>
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>Name</th>
                    </tr>
                  </tfoot>
                  <tbody>
                    <tr>
                      <td>빈둥빈둥</td>
                    </tr>
                    <tr>
                      <td>좌식업무</td>
                    </tr>
                    <tr>
                      <td>돌아다니는 업무</td>
                    </tr>
                    <tr>
                      <td>활동적인 업무</td>
                    </tr>
                    <tr>
                      <td>일반 직장인</td>
                    </tr>
                    <tr>
                      <td>휴일 직장인</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import dayjs from "dayjs";
export default {
  name: "activityManage",
  data() {
    return {
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
    };
  },
};
</script>

<style scoped>
</style>