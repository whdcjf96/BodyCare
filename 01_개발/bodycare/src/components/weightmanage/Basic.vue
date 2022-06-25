<template>
  <div>
    <!-- Begin Page Content -->
    <!-- TODO : 현재 날짜 출력 -->
    <div class="row no-gutters">
      <div
          class="ma-0 pa-3 col col-12"
          style="
          background-color: #4e73df;
          color: white;
          font-size: 30px;
          font-weight: bold;
          text-align: center;
        "
      >
        <span> &lt;</span> {{ today }} <span> &gt;</span>
      </div>
    </div>

    <div class="container-fluid">
      <!-- 테스트 -->

      <!-- Content Row -->
      <div class="row no-gutters align-center justify-center">

        <div class="container-fluid">
          <!-- Content Row -->
          <div class="row">
            <!-- Content Column -->
            <div class="col-lg-12 mb-4">
              <div class="row no-gutters align-center justify-center">
                <!-- Project Card Example -->
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <!-- TODO : Project -> 활동대사량 이름 수정 -->
                    <h6 class="m-0 font-weight-bold text-primary">
                      체중
                      <!-- TODO : 기초대사량 추가 -->
                    </h6>
                  </div>
                  <div class="card-body text-center">
                    <input
                        type="text"
                        style="border: none; border-bottom: solid"
                        placeholder="0"
                    />
                    <h6 class="float-right">kg</h6>
                  </div>
                </div>

                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <!-- TODO : Project -> 활동대사량 이름 수정 -->
                    <h6 class="m-0 font-weight-bold text-primary">체지방률</h6>
                  </div>
                  <div class="card-body text-center">
                    <input
                        type="text"
                        style="border: none; border-bottom: solid"
                        placeholder="0"
                    />
                    <h6 class="float-right">%</h6>
                  </div>
                </div>
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <!-- TODO : Project -> 활동대사량 이름 수정 -->
                    <h6 class="m-0 font-weight-bold text-primary">
                      골격근량
                      <!-- TODO : 기초대사량 추가 -->
                    </h6>
                  </div>
                  <div class="card-body text-center">
                    <input
                        type="text"
                        style="border: none; border-bottom: solid"
                        placeholder="0"
                    />
                    <h6 class="float-right">kg</h6>
                  </div>
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

import dayjs from "dayjs";

export default {
  name: "basic",
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