<template>
  <div id="wrapper" style="width: 100%">
    <div>
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
          <div class="sidebar-brand-icon ">
            <i class="fas fa-laptop-medical"></i>
          </div>
          <div class="sidebar-brand-text mx-3">Nutrition Assistant</div>
        </router-link>

        <!-- TODO : DietCom 라우터버튼 -->
        <!-- Nav Item - ActivityManage -->
        <li class="nav-item">
          <router-link to="/mypage" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>기본</span>
          </router-link>
        </li>
      </ul>
      <!-- End of Sidebar -->
    </div>
    <div style="width: 100%">
      <!-- Topbar -->
      <nav
          class="
          navbar navbar-expand navbar-light
          bg-gradient-primary2
          topbar
          static-top
          shadow
        "
      >
        <!-- Topbar Navbar -->
        <ul class="navbar-nav">
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

        <div class="row mt-3">
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h3 class="m-0 font-weight-bold text-info">
                  계정
                </h3>
                <p class="font-weight-bold text-info mt-3">기본 정보 표시</p>
              </div>
              <div class="card-body">
                <!--                마이페이지 시작-->
                <div class="row">
                  <!--    이름 시작-->
                  <div class="col">
                    <div class="card shadow mb-4">
                      <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">
                          이름
                        </h6>
                      </div>
                      <div class="card-body">
                        <!-- {{currentUser.name}} -->
                      </div>
                    </div>
                  </div>
                  <!--                  이름 끝-->


                </div>
                <!--    이메일 시작-->
                <div class="row">
                  <div class="col">
                    <div class="card shadow mb-4">
                      <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">
                          이메일
                        </h6>
                      </div>
                      <div class="card-body">
                        {{ currentUser.email }}
                      </div>
                    </div>
                  </div>
                  <!--                  이메일 끝-->
                </div>

                <div class="row">
                  <!--    키 시작-->
                  <div class="col">
                    <div class="card shadow mb-4">
                      <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">
                          키
                        </h6>
                      </div>
                      <div class="card-body">
                        {{ currentUser.height }}
                      </div>
                    </div>
                  </div>
                  <!--                  키 끝-->
                  <!--    성별 시작-->
                  <div class="col">
                    <div class="card shadow mb-4">
                      <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">
                          성별
                        </h6>
                      </div>
                      <div class="card-body">
                        {{ currentUser.gender }}
                      </div>
                    </div>
                  </div>
                  <!--                  성별 끝-->
                  <div class="col">
                    <div class="card shadow mb-4">
                      <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">
                          나이
                        </h6>
                      </div>
                      <div class="card-body">
                        {{ currentUser.age }}
                      </div>
                    </div>
                  </div>
                  <!--                  성별 끝-->
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
import UserDataService from "@/services/UserDataService";
export default {
  name: "MyPage",
  data(){
    return{
      currentUser: null,
      message:"",
    }
  },
  computed:{
    currentUser(){
      return this.$store.state.auth.user;
    }
  },
  mounted() {
    this.message="";
    console.log(this.$route.params.email);
    console.log(this.currentUser);
    this.getUsersById(this.$route.params.id);
  },
  methods:{
    getUsersById(id){
      UserDataService.getUsersById(id)
          .then((response)=>{
            this.currentUser= response.data;
            console.log(response.data + "~~~~~~~~~~~~~~~");
          }).catch((e)=>{
            console.log(e+"~~~~~~~~~~~~~~~`");
      })
    }
  }
}
</script>

<style scoped>

</style>