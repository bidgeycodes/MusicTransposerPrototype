import { createRouter, createWebHistory } from 'vue-router'
import PageView from '../views/PageView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'page',
      component: PageView
    }
  ]
})

export default router
