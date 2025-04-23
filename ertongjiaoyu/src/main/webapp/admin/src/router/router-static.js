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

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import laoshi from '@/views/modules/laoshi/list'
    import shipin from '@/views/modules/shipin/list'
    import shipinCollection from '@/views/modules/shipinCollection/list'
    import shipinLiuyan from '@/views/modules/shipinLiuyan/list'
    import shipinZhangjie from '@/views/modules/shipinZhangjie/list'
    import shipinZhangjieCollection from '@/views/modules/shipinZhangjieCollection/list'
    import wenzhang from '@/views/modules/wenzhang/list'
    import wenzhangCollection from '@/views/modules/wenzhangCollection/list'
    import wenzhangLiuyan from '@/views/modules/wenzhangLiuyan/list'
    import wenzhangMulu from '@/views/modules/wenzhangMulu/list'
    import wenzhangMuluCollection from '@/views/modules/wenzhangMuluCollection/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryNianlingduan from '@/views/modules/dictionaryNianlingduan/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryShipin from '@/views/modules/dictionaryShipin/list'
    import dictionaryShipinCollection from '@/views/modules/dictionaryShipinCollection/list'
    import dictionaryShipinZhangjieCollection from '@/views/modules/dictionaryShipinZhangjieCollection/list'
    import dictionaryVip from '@/views/modules/dictionaryVip/list'
    import dictionaryVipshipin from '@/views/modules/dictionaryVipshipin/list'
    import dictionaryVipwenzhang from '@/views/modules/dictionaryVipwenzhang/list'
    import dictionaryWenzhang from '@/views/modules/dictionaryWenzhang/list'
    import dictionaryWenzhangCollection from '@/views/modules/dictionaryWenzhangCollection/list'
    import dictionaryWenzhangMuluCollection from '@/views/modules/dictionaryWenzhangMuluCollection/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryNianlingduan',
        name: '适合年龄段',
        component: dictionaryNianlingduan
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryShipin',
        name: '视频类型',
        component: dictionaryShipin
    }
    ,{
        path: '/dictionaryShipinCollection',
        name: '收藏表类型',
        component: dictionaryShipinCollection
    }
    ,{
        path: '/dictionaryShipinZhangjieCollection',
        name: '收藏表类型',
        component: dictionaryShipinZhangjieCollection
    }
    ,{
        path: '/dictionaryVip',
        name: '是否vip',
        component: dictionaryVip
    }
    ,{
        path: '/dictionaryVipshipin',
        name: '是否vip视频',
        component: dictionaryVipshipin
    }
    ,{
        path: '/dictionaryVipwenzhang',
        name: '是否vip文章',
        component: dictionaryVipwenzhang
    }
    ,{
        path: '/dictionaryWenzhang',
        name: '文章类型',
        component: dictionaryWenzhang
    }
    ,{
        path: '/dictionaryWenzhangCollection',
        name: '收藏表类型',
        component: dictionaryWenzhangCollection
    }
    ,{
        path: '/dictionaryWenzhangMuluCollection',
        name: '收藏表类型',
        component: dictionaryWenzhangMuluCollection
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/laoshi',
        name: '名师',
        component: laoshi
      }
    ,{
        path: '/shipin',
        name: '视频',
        component: shipin
      }
    ,{
        path: '/shipinCollection',
        name: '视频收藏',
        component: shipinCollection
      }
    ,{
        path: '/shipinLiuyan',
        name: '视频留言',
        component: shipinLiuyan
      }
    ,{
        path: '/shipinZhangjie',
        name: '章节',
        component: shipinZhangjie
      }
    ,{
        path: '/shipinZhangjieCollection',
        name: '章节收藏',
        component: shipinZhangjieCollection
      }
    ,{
        path: '/wenzhang',
        name: '文章',
        component: wenzhang
      }
    ,{
        path: '/wenzhangCollection',
        name: '文章收藏',
        component: wenzhangCollection
      }
    ,{
        path: '/wenzhangLiuyan',
        name: '文章留言',
        component: wenzhangLiuyan
      }
    ,{
        path: '/wenzhangMulu',
        name: '文章目录',
        component: wenzhangMulu
      }
    ,{
        path: '/wenzhangMuluCollection',
        name: '文章目录收藏',
        component: wenzhangMuluCollection
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
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
    name: '首页',
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

export default router;
