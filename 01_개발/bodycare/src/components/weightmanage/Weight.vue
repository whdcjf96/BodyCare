<template>
  <!-- 화면 전체 시작 -->
  <div class="container ma-0 pa-0 container--fluid">
    <!-- 화면 바디 시작 -->
    <div class="basic">
      <!-- 본문 -->
      <div class="row no-gutters align-center justify-center">
        <!-- 그래프란 -->
        <div class="card shadow mt-3 col col-12">
          <div class="pa-4 ml-3  mt-2 ma-3 v-card v-card--flat v-sheet theme--light">
          그래프
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

</template>

<script>
/*eslint-disable*/

export default {
  name: "weight",
};
</script>

<style scoped>
</style>