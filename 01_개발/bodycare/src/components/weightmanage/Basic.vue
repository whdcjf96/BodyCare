<template>
  <div>
    <!-- Begin Page Content -->
    <!-- TODO : 현재 날짜 출력 -->
    <div class="row no-gutters">
      <div class="ma-0 pa-3 col col-12"
           style="background-color: #4e73df; color: white; font-size: 30px; font-weight: bold; text-align: center;">
        <span> &lt;</span> {{ today }} <span> &gt;</span>
      </div>
    </div>
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
                <input type="text" style="border: none; border-bottom: solid; " placeholder="0">
                <h6 class="float-right">kg</h6>
              </div>
            </div>

            <div class="card shadow mb-4">
              <div class="card-header py-1">
                <!-- TODO : Project -> 활동대사량 이름 수정 -->
                <h6 class="m-0 font-weight-bold text-primary">
                  체지방률
                </h6>
              </div>
              <div class="card-body text-center">
                <input type="text" style="border: none; border-bottom: solid; " placeholder="0">
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
                <input type="text" style="border: none; border-bottom: solid; " placeholder="0">
                <h6 class="float-right">kg</h6>
              </div>
            </div>
          </div>
          <div data-v-541632ae="" class="col col-12">
            <div data-v-541632ae="" class="pa-4 ma-3 v-card v-card--flat v-sheet theme--light">
              <div data-v-541632ae="" class="row mt-0 row--dense">
                <div data-v-541632ae="" class="ma-0 mb-5 pa-0 col col-2"></div>
                <div data-v-541632ae="" class="caption ma-0 mb-3 pa-0 col col-10"
                     style="position: relative; background: transparent;">
                  <div data-v-541632ae="" vertical-align="center" style="position: absolute; left: 0%;">6</div>
                  <div data-v-541632ae="" style="position: absolute; left: 20%;">9.5</div>
                  <div data-v-541632ae="" style="position: absolute; left: 40%;">11.5</div>
                  <div data-v-541632ae="" style="position: absolute; left: 60%;">13.2</div>
                  <div data-v-541632ae="" style="position: absolute; left: 80%;">14.5</div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 0%; width: 20%;">매우낮음
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 20%; width: 20%;">낮음
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 40%; width: 20%;">보통
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 60%; width: 20%;">높음
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 80%; width: 20%;">매우높음
                  </div>
                </div><!----></div>
              <div data-v-541632ae="" class="row mt-1 row--dense">
                <div data-v-541632ae="" align="center" class="subtitle-2 font-weight-bold col col-2"> 골격근량</div>
                <div data-v-541632ae="" class="caption pa-0 col col-10"
                     style="position: relative; background: linear-gradient(90deg, rgb(214, 57, 57) 0%, rgb(228, 175, 11) 50%, rgb(15, 106, 195) 100%);">
                  <div data-v-541632ae=""
                       style="position: absolute; left: 20%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae=""
                       style="position: absolute; left: 40%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae=""
                       style="position: absolute; left: 60%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae=""
                       style="position: absolute; left: 80%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae="" class="mt-0"
                       style="position: relative; left: 72.3077%; border: 2px solid black; height: 100%; width: 2px;"></div>
                </div><!----></div>
              <div data-v-541632ae="" class="row mt-5 row--dense">
                <div data-v-541632ae="" class="ma-0 mb-5 pa-0 col col-2"></div>
                <div data-v-541632ae="" class="caption ma-0 mb-3 pa-0 col col-10"
                     style="position: relative; background: transparent;">
                  <div data-v-541632ae="" style="position: absolute; left: 0%;">3%</div>
                  <div data-v-541632ae="" style="position: absolute; left: 20%;">8%</div>
                  <div data-v-541632ae="" style="position: absolute; left: 40%;">12%</div>
                  <div data-v-541632ae="" style="position: absolute; left: 60%;">18%</div>
                  <div data-v-541632ae="" style="position: absolute; left: 80%;">25%</div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 0%; width: 20%;">매우낮음
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 20%; width: 20%;">낮음
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 40%; width: 20%;">보통
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 60%; width: 20%;">높음
                  </div>
                  <div data-v-541632ae="" align="center" class="ma-0 mt-6 pa-0 white--text"
                       style="z-index: 1; position: absolute; left: 80%; width: 20%;">매우높음
                  </div>
                </div><!----></div>
              <div data-v-541632ae="" class="row mt-1 row--dense">
                <div data-v-541632ae="" align="center" class="subtitle-2 font-weight-bold col col-2"> 체지방률</div>
                <div data-v-541632ae="" class="caption pa-0 col col-10"
                     style="position: relative; background: linear-gradient(270deg, rgb(214, 57, 57) 0%, rgb(228, 175, 11) 50%, rgb(15, 106, 195) 100%);">
                  <div data-v-541632ae=""
                       style="position: absolute; left: 20%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae=""
                       style="position: absolute; left: 40%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae=""
                       style="position: absolute; left: 60%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae=""
                       style="position: absolute; left: 80%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                  <div data-v-541632ae="" class="mt-0"
                       style="position: relative; left: 100%; border: 2px solid black; height: 100%; width: 2px;"></div>
                </div><!----></div>
            </div>
            <div  class="pa-4 ma-3 v-card v-card--flat v-sheet theme--light">
              <div  class="v-card__title">추천 체중 관리</div>
              <div  class="v-card__text font-weight-bold"> 다이어트 추천</div>
            </div>
          </div>

        </div>

        <div class="row"></div>
        <!-- TODO : 내용 수정 -->
        <div class="col-lg-8 mb-4">
          <!-- Illustrations -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">

            </div>
          </div>
        </div>


      </div>
    </div>
  </div>


  <!--
  <div>
    <div class="row no-gutters">
      <div class="ma-0 pa-3 col col-12" style="background-color: #4e73df; color: white; font-size: 30px; font-weight: bold; text-align: center;">
        &lt; 2022-6-24 &gt;
      </div>
    </div>
    <div class=" row justify-content-around">
        <div class="col-4 input-group mb-3 input-group-lg">
          <input type="text" class="form-control" placeholder="체중">
          <span class="input-group-text">kg</span>
        </div>
        <div class="col-4 input-group mb-3 input-group-lg">
          <input type="text" class="form-control" placeholder="체지방률">
          <span class="input-group-text">%</span>
        </div>
        <div class="col-4 input-group mb-3 input-group-lg">
          <input type="text" class="form-control" placeholder="골격근량">
          <span class="input-group-text">kg</span>
        </div>
    </div>
  </div>
  -->
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
}
</script>

<style scoped>

</style>