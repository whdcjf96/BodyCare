<template>
  <div class="container-fluid">
    <!--    첫줄-->
    <div class="row mt-3">
      <!--    체중 시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">체중</h6>
          </div>
          <div class="card-body">
            체중값 긁어오기
          </div>
        </div>
      </div>
      <!--    체중 끝-->

      <!--    체지방률 시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">체지방률</h6>
          </div>
          <div class="card-body">
            체지방률 긁어오기
          </div>
        </div>
      </div>
      <!--    체지방률 끝-->
    </div>
    <!--    1번 row 끝-->

    <!--    2번 row-->
    <div class="row">
      <!--    원하는 체지방률 시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">원하는 체지방률</h6>
          </div>
          <div class="card-body">
            0
          </div>
        </div>
      </div>
      <!--    원하는 체지방률 끝-->
      <!--    시작시 줄일 칼로리 시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">시작시 줄일 칼로리</h6>
          </div>
          <div class="card-body">
            0
          </div>
        </div>
      </div>
      <!--    시작시 줄일 칼로리 끝-->
      <!--    매주 줄일 칼로리 시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">매주 줄일 칼로리</h6>
          </div>
          <div class="card-body">
            0
          </div>
        </div>
      </div>
      <!--    매주 줄일 칼로리 끝-->
    </div>
<!--    2번 row끝-->

<!--    3번 row시작-->
    <div class="row">
      <!--    원하는 체지방률일 때의 체중 시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">원하는 체지방률일 때의 체중</h6>
          </div>
          <div class="card-body">
            0
          </div>
        </div>
      </div>
      <!--    원하는 체지방률일 때의 체중 끝-->
      <!--    빼야 할  시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">빼야 할 체중</h6>
          </div>
          <div class="card-body">
            0
          </div>
        </div>
      </div>
      <!--    빼야 할 체중 끝-->
      <!--    다이어트 기간 시작-->
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">예상 다이어트 기간</h6>
          </div>
          <div class="card-body">
            0
          </div>
        </div>
      </div>
      <!--    다이어트 기간 끝-->
    </div>
<!--    3번 row 끝-->

<!--    comment 시작-->
    <div class="row">
      <div class="col">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Comment</h6>
          </div>
          <div class="card-body">
            ...
          </div>
        </div>
      </div>
    </div>
<!--    comment 끝-->
  </div>
</template>

<script>
export default {
  name: "DietCom"
}
</script>

<style scoped>

</style>