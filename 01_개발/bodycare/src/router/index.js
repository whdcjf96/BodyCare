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
  {
    path: '/basic',
    name: 'baisc',
    component: () => import('../components/weightmanage/Basic.vue')
  },
  {
    path: '/diet',
    name: 'diet',
    component: () => import('../components/exerciseAssistant/DietCom')
  },
  {
    path: '/login',
    name: 'login',
    component: () => import('../components/userManage/LogInCom')
  },
  {
    path: '/register',
    name: 'register',
    component: () => import('../components/userManage/RegisterCom')
  },

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
