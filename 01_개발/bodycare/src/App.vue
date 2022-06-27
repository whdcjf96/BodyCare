<template>
  <div id="wrapper">
    <!-- Sidebar -->
    <ul
      class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
      id="accordionSidebar"
    >
      <!-- Sidebar - Brand -->
      <router-link
        to="/"
        class="sidebar-brand d-flex align-items-center justify-content-center"
      >
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Body Care</div>
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
    <!-- End of Content Wrapper -->
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: "app",
};
</script>

<style>
@import "../public/css/sb-admin-2.css";
</style>