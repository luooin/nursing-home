import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import hugongList from '../pages/hugong/list'
import hugongDetail from '../pages/hugong/detail'
import hugongAdd from '../pages/hugong/add'
import jiashuList from '../pages/jiashu/list'
import jiashuDetail from '../pages/jiashu/detail'
import jiashuAdd from '../pages/jiashu/add'
import fangjianziliaoList from '../pages/fangjianziliao/list'
import fangjianziliaoDetail from '../pages/fangjianziliao/detail'
import fangjianziliaoAdd from '../pages/fangjianziliao/add'
import chuangweiList from '../pages/chuangwei/list'
import chuangweiDetail from '../pages/chuangwei/detail'
import chuangweiAdd from '../pages/chuangwei/add'
import laorenruzhuList from '../pages/laorenruzhu/list'
import laorenruzhuDetail from '../pages/laorenruzhu/detail'
import laorenruzhuAdd from '../pages/laorenruzhu/add'
import waichubaobeiList from '../pages/waichubaobei/list'
import waichubaobeiDetail from '../pages/waichubaobei/detail'
import waichubaobeiAdd from '../pages/waichubaobei/add'
import tuifangdengjiList from '../pages/tuifangdengji/list'
import tuifangdengjiDetail from '../pages/tuifangdengji/detail'
import tuifangdengjiAdd from '../pages/tuifangdengji/add'
import meiyuecanyinList from '../pages/meiyuecanyin/list'
import meiyuecanyinDetail from '../pages/meiyuecanyin/detail'
import meiyuecanyinAdd from '../pages/meiyuecanyin/add'
import shigujiluList from '../pages/shigujilu/list'
import shigujiluDetail from '../pages/shigujilu/detail'
import shigujiluAdd from '../pages/shigujilu/add'
import fangkejiluList from '../pages/fangkejilu/list'
import fangkejiluDetail from '../pages/fangkejilu/detail'
import fangkejiluAdd from '../pages/fangkejilu/add'
import binglidanganList from '../pages/binglidangan/list'
import binglidanganDetail from '../pages/binglidangan/detail'
import binglidanganAdd from '../pages/binglidangan/add'
import ruyuanzhinanList from '../pages/ruyuanzhinan/list'
import ruyuanzhinanDetail from '../pages/ruyuanzhinan/detail'
import ruyuanzhinanAdd from '../pages/ruyuanzhinan/add'
import yaopinxinxiList from '../pages/yaopinxinxi/list'
import yaopinxinxiDetail from '../pages/yaopinxinxi/detail'
import yaopinxinxiAdd from '../pages/yaopinxinxi/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'hugong',
					component: hugongList
				},
				{
					path: 'hugongDetail',
					component: hugongDetail
				},
				{
					path: 'hugongAdd',
					component: hugongAdd
				},
				{
					path: 'jiashu',
					component: jiashuList
				},
				{
					path: 'jiashuDetail',
					component: jiashuDetail
				},
				{
					path: 'jiashuAdd',
					component: jiashuAdd
				},
				{
					path: 'fangjianziliao',
					component: fangjianziliaoList
				},
				{
					path: 'fangjianziliaoDetail',
					component: fangjianziliaoDetail
				},
				{
					path: 'fangjianziliaoAdd',
					component: fangjianziliaoAdd
				},
				{
					path: 'chuangwei',
					component: chuangweiList
				},
				{
					path: 'chuangweiDetail',
					component: chuangweiDetail
				},
				{
					path: 'chuangweiAdd',
					component: chuangweiAdd
				},
				{
					path: 'laorenruzhu',
					component: laorenruzhuList
				},
				{
					path: 'laorenruzhuDetail',
					component: laorenruzhuDetail
				},
				{
					path: 'laorenruzhuAdd',
					component: laorenruzhuAdd
				},
				{
					path: 'waichubaobei',
					component: waichubaobeiList
				},
				{
					path: 'waichubaobeiDetail',
					component: waichubaobeiDetail
				},
				{
					path: 'waichubaobeiAdd',
					component: waichubaobeiAdd
				},
				{
					path: 'tuifangdengji',
					component: tuifangdengjiList
				},
				{
					path: 'tuifangdengjiDetail',
					component: tuifangdengjiDetail
				},
				{
					path: 'tuifangdengjiAdd',
					component: tuifangdengjiAdd
				},
				{
					path: 'meiyuecanyin',
					component: meiyuecanyinList
				},
				{
					path: 'meiyuecanyinDetail',
					component: meiyuecanyinDetail
				},
				{
					path: 'meiyuecanyinAdd',
					component: meiyuecanyinAdd
				},
				{
					path: 'shigujilu',
					component: shigujiluList
				},
				{
					path: 'shigujiluDetail',
					component: shigujiluDetail
				},
				{
					path: 'shigujiluAdd',
					component: shigujiluAdd
				},
				{
					path: 'fangkejilu',
					component: fangkejiluList
				},
				{
					path: 'fangkejiluDetail',
					component: fangkejiluDetail
				},
				{
					path: 'fangkejiluAdd',
					component: fangkejiluAdd
				},
				{
					path: 'binglidangan',
					component: binglidanganList
				},
				{
					path: 'binglidanganDetail',
					component: binglidanganDetail
				},
				{
					path: 'binglidanganAdd',
					component: binglidanganAdd
				},
				{
					path: 'ruyuanzhinan',
					component: ruyuanzhinanList
				},
				{
					path: 'ruyuanzhinanDetail',
					component: ruyuanzhinanDetail
				},
				{
					path: 'ruyuanzhinanAdd',
					component: ruyuanzhinanAdd
				},
				{
					path: 'yaopinxinxi',
					component: yaopinxinxiList
				},
				{
					path: 'yaopinxinxiDetail',
					component: yaopinxinxiDetail
				},
				{
					path: 'yaopinxinxiAdd',
					component: yaopinxinxiAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
