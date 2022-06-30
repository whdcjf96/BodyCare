<template>
  <div id="wrapper" style="width: 100%">
    <div style="width: 100%">
      <!-- Topbar -->
      <nav
          class="
          navbar navbar-expand navbar-light
          bg-primary
          topbar
          static-top
          shadow
        "
      >
        <!-- Topbar Navbar -->

        <ul class="navbar-nav">
          <li class="nav-item">
            <router-link
                to="/"
                class=" nav-link mr-5 text-white "
                id="navbarDropdownMenuLink"
                aria-haspopup="true"
                aria-expanded="false"
            >
              <div class="sidebar-brand-icon ">
                <i class="fas fa-laptop-medical"></i>
              </div>
              <div class="sidebar-brand-text mx-3">Nutrition <br> Assistant</div>
            </router-link>
          </li>
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

      <!-- 화면 전체 시작 -->
      <div class="container-fluid">
        <!-- 화면 바디 시작 -->
        <div class="row">
          <!--  메인 바디-->
        </div>
        <!-- 화면 바디 끝 -->
      </div>
      <!-- 화면 전체 끝 -->
    </div>
  </div>


</template>

<script>
export default {};
</script>

<style>
</style>