import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import binglidangan from '@/views/modules/binglidangan/list'
    import shigujilu from '@/views/modules/shigujilu/list'
    import jiashu from '@/views/modules/jiashu/list'
    import meiyuecanyin from '@/views/modules/meiyuecanyin/list'
    import laorenruzhu from '@/views/modules/laorenruzhu/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import waichubaobei from '@/views/modules/waichubaobei/list'
    import tuifangdengji from '@/views/modules/tuifangdengji/list'
    import users from '@/views/modules/users/list'
    import ruyuanzhinan from '@/views/modules/ruyuanzhinan/list'
    import systemintro from '@/views/modules/systemintro/list'
    import hugong from '@/views/modules/hugong/list'
    import messages from '@/views/modules/messages/list'
    import fangjianziliao from '@/views/modules/fangjianziliao/list'
    import fangkejilu from '@/views/modules/fangkejilu/list'
    import config from '@/views/modules/config/list'
    import chuangwei from '@/views/modules/chuangwei/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/binglidangan',
        name: '病历档案',
        component: binglidangan
      }
      ,{
	path: '/shigujilu',
        name: '事故记录',
        component: shigujilu
      }
      ,{
	path: '/jiashu',
        name: '家属',
        component: jiashu
      }
      ,{
	path: '/meiyuecanyin',
        name: '每月餐饮',
        component: meiyuecanyin
      }
      ,{
	path: '/laorenruzhu',
        name: '老人入住',
        component: laorenruzhu
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/waichubaobei',
        name: '外出报备',
        component: waichubaobei
      }
      ,{
	path: '/tuifangdengji',
        name: '退房登记',
        component: tuifangdengji
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/ruyuanzhinan',
        name: '入院指南',
        component: ruyuanzhinan
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/hugong',
        name: '护工',
        component: hugong
      }
      ,{
	path: '/messages',
        name: '留言板',
        component: messages
      }
      ,{
	path: '/fangjianziliao',
        name: '房间资料',
        component: fangjianziliao
      }
      ,{
	path: '/fangkejilu',
        name: '访客记录',
        component: fangkejilu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/chuangwei',
        name: '床位',
        component: chuangwei
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
