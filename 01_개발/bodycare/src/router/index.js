import Vue from 'vue'
import VueRouter from 'vue-router'
// import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    alias: '/home',
    name: 'home',
    component: () => import('../views/HomeView.vue')
  },
    //todo 기본 페이지 추가
  {
    path: '/basic',
    name: 'baisc',
    component: () => import('../components/weightmanage/Basic.vue')
  },


  // TODO : food 라우터 달기
  {
    path: '/food',
    name: 'food',
    component: () => import('../components/weightmanage/Food.vue')
  },

  // TODO : ActivityManage 라우터 달기

  {
    path: '/activityManage',
    name: 'activityManage',
    component: () => import("../components/weightmanage/ActivityManage")

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
