<template>
<div class="content" :style='{"minHeight":"100vh","padding":"0 0 500px","alignItems":"flex-start","textAlign":"center","flexWrap":"wrap","background":"#fff","display":"block","justifyContent":"center","height":"auto"}'>
	<div class="text" :style='{"padding":"20px 0 0","margin":"0 auto","color":"#333","textAlign":"center","background":"url() no-repeat center top","width":"100%","fontSize":"32px","fontWeight":"bold"}'>欢迎使用 {{this.$project.projectName}}</div>
</div>
</template>
<script>
//0
import router from '@/router/router-static'
import * as echarts from 'echarts'
export default {
	data() {
		return {
		};
	},
  mounted(){
    this.init();
  },
  methods:{
    init(){
        if(this.$storage.get('Token')){
        this.$http({
            url: `${this.$storage.get('sessionTable')}/session`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code != 0) {
            router.push({ name: 'login' })
            }
        });
        }else{
            router.push({ name: 'login' })
        }
    },
  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
</style>
