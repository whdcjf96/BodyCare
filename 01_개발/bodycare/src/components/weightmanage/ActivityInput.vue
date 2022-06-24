<template>
  <!-- 화면 시작 -->
  <div class="container-fluid" id="page-top">
    <!-- 화면 바디 시작 -->
    <div class="row">
      <!-- 1번 row 시작 -->
      <div class="col-lg-6 mb-4">
        <div class="card shadow mb-4">
          <div class="card-body">
            <div class="table-responsive">
              <table class="table" id="dataTable" width="100%" cellspacing="0">
                <thead>
                  <tr>
                    <th>활동</th>
                    <th>활동강도</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>잠자기</td>
                    <td>0.93</td>
                  </tr>
                  <tr>
                    <td>누워있기</td>
                    <td>1.2</td>
                  </tr>
                  <tr>
                    <td>읽기</td>
                    <td>1.3</td>
                  </tr>
                  <tr>
                    <td>앉아서 TV</td>
                    <td>1.57</td>
                  </tr>
                  <tr>
                    <td>사무업무</td>
                    <td>1.6</td>
                  </tr>
                  <tr>
                    <td>휴일 직장인</td>
                    <td>1.75</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
      <!-- 1번 row 끝-->

      <!-- 2번 row 시작-->
      <div class="col-lg-6 mb-4">
        <!-- 활동창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body text-center">
            <div class="text-left">
              <h6>활동</h6>
            </div>
            <h4>선택하세요</h4>
          </div>
        </div>
        <!-- 활동창 끝 -->

        <!-- 시간창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body">
            <div class="text-left">
              <h6>시간</h6>
            </div>
            <div class="text-center">0</div>
            <div class="float-right">hours</div>
          </div>
        </div>
        <!-- 시간창 끝 -->
      </div>
      <!-- 2번 row 끝-->
    </div>
    <!-- 화면 바디 끝 -->

    <!-- 취소버튼 -->
    <router-link to="/activityManage">
    <button class="btn btn-danger float-left">취소</button>
    </router-link>

    <!-- 저장 후 추가 버튼 -->
    <button class="btn btn-primary float-right">저장 후 추가</button>
  </div>
</template>

<script>
export default {
  name: "activityInput",
};
</script>

<style>
</style>