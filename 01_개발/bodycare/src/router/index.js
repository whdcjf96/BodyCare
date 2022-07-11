import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    alias: '/home',
    name: 'home',
    component: () => import('../views/HomeView.vue')
  },
  // TODO : baisc 라우터 달기
  {
    path: '/basic',
    name: 'baisc',
    component: () => import('../components/weightmanage/Basic.vue')
  },
  // TODO : weight 라우터 달기
  {
    path: '/weight',
    name: 'weight',
    component: () => import('../components/weightmanage/Weight.vue')
  },
  // TODO : food 라우터 달기
  {
    path: '/food',
    name: 'food',
    component: () => import('../components/weightmanage/Food.vue')
  },
  // TODO : FoodInput 라우터 달기
  {
    path: '/foodInput',
    name: 'foodInput',
    component: () => import("../components/weightmanage/FoodInput")

  },

  // TODO : ActivityManage 라우터 달기
  {
    path: '/activityManage',
    name: 'activityManage',
    component: () => import("../components/weightmanage/ActivityManage")

  },
  // TODO : ActivityInput 라우터 달기
  {
    path: '/activityInput',
    name: 'activityInput',
    component: () => import("../components/weightmanage/ActivityInput")

  },

  // TODO : DietCom 라우터 달기
  {
    path: '/diet',
    name: 'diet',
    component: () => import("../components/exerciseAssistant/Diet")

  },
  // TODO : supplement 라우터 달기
  {
    path: '/supplement',
    name: 'supplement',
    component: () => import("../components/exerciseAssistant/Supplement")

  },
  {
    path: '/login',
    name: 'login',
    component: () => import("../components/userManage/LogIn")

  },
  {
    path: '/register',
    name: 'register',
    component: () => import("../components/userManage/Register")

  },
  {
    path: '/mypage',
    name: 'mypage',
    component: () => import("../components/userManage/MyPage")

  }
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
