export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"护工","menuJump":"列表","tableName":"hugong"}],"menu":"护工管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"家属","menuJump":"列表","tableName":"jiashu"}],"menu":"家属管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"房间资料","menuJump":"列表","tableName":"fangjianziliao"}],"menu":"房间资料管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"床位","menuJump":"列表","tableName":"chuangwei"}],"menu":"床位管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除"],"menu":"老人入住","menuJump":"列表","tableName":"laorenruzhu"}],"menu":"老人入住管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"外出报备","menuJump":"列表","tableName":"waichubaobei"}],"menu":"外出报备管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","修改","删除"],"menu":"退房登记","menuJump":"列表","tableName":"tuifangdengji"}],"menu":"退房登记管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","修改","删除"],"menu":"每月餐饮","menuJump":"列表","tableName":"meiyuecanyin"}],"menu":"每月餐饮管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除"],"menu":"事故记录","menuJump":"列表","tableName":"shigujilu"}],"menu":"事故记录管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改","删除"],"menu":"访客记录","menuJump":"列表","tableName":"fangkejilu"}],"menu":"访客记录管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除"],"menu":"病历档案","menuJump":"列表","tableName":"binglidangan"}],"menu":"病历档案管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除"],"menu":"入院指南","menuJump":"列表","tableName":"ruyuanzhinan"}],"menu":"入院指南管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"留言板","tableName":"messages"}],"menu":"留言板"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-link","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"},{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"入院指南列表","menuJump":"列表","tableName":"ruyuanzhinan"}],"menu":"入院指南模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","入住登记"],"menu":"床位","menuJump":"列表","tableName":"chuangwei"}],"menu":"床位管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","删除","外出","退房","访客","病历档案","每月餐饮"],"menu":"老人入住","menuJump":"列表","tableName":"laorenruzhu"}],"menu":"老人入住管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"外出报备","menuJump":"列表","tableName":"waichubaobei"}],"menu":"外出报备管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"退房登记","menuJump":"列表","tableName":"tuifangdengji"}],"menu":"退房登记管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"每月餐饮","menuJump":"列表","tableName":"meiyuecanyin"}],"menu":"每月餐饮管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"事故记录","menuJump":"列表","tableName":"shigujilu"}],"menu":"事故记录管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"访客记录","menuJump":"列表","tableName":"fangkejilu"}],"menu":"访客记录管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"病历档案","menuJump":"列表","tableName":"binglidangan"}],"menu":"病历档案管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"入院指南列表","menuJump":"列表","tableName":"ruyuanzhinan"}],"menu":"入院指南模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"护工","tableName":"hugong"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","支付"],"menu":"老人入住","menuJump":"列表","tableName":"laorenruzhu"}],"menu":"老人入住管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"外出报备","menuJump":"列表","tableName":"waichubaobei"}],"menu":"外出报备管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"退房登记","menuJump":"列表","tableName":"tuifangdengji"}],"menu":"退房登记管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","支付"],"menu":"每月餐饮","menuJump":"列表","tableName":"meiyuecanyin"}],"menu":"每月餐饮管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"访客记录","menuJump":"列表","tableName":"fangkejilu"}],"menu":"访客记录管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"病历档案","menuJump":"列表","tableName":"binglidangan"}],"menu":"病历档案管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"入院指南列表","menuJump":"列表","tableName":"ruyuanzhinan"}],"menu":"入院指南模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"家属","tableName":"jiashu"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
