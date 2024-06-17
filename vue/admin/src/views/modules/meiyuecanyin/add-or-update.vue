<template>
	<div class="addEdit-block" :style='{"padding":" 30px 20px","flexWrap":"wrap","background":"none","display":"flex"}' style="width: 100%;">
		<el-form
			:style='{"padding":"30px 40px 220px","boxShadow":"0 0px 0px #999","borderRadius":"6px","flexWrap":"wrap","background":"none","display":"flex","justifyContent":"space-between"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="date" v-if="type!='info'" label="日期" prop="riqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.riqi" 
						type="date"
						:readonly="ro.riqi"
						placeholder="日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-else-if="ruleForm.riqi" label="日期" prop="riqi">
					<el-input v-model="ruleForm.riqi" placeholder="日期" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="家属账号" prop="jiashuzhanghao">
					<el-input v-model="ruleForm.jiashuzhanghao" placeholder="家属账号" clearable  :readonly="ro.jiashuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="家属账号" prop="jiashuzhanghao">
					<el-input v-model="ruleForm.jiashuzhanghao" placeholder="家属账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="家属姓名" prop="jiashuxingming">
					<el-input v-model="ruleForm.jiashuxingming" placeholder="家属姓名" clearable  :readonly="ro.jiashuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="家属姓名" prop="jiashuxingming">
					<el-input v-model="ruleForm.jiashuxingming" placeholder="家属姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="老人姓名" prop="laorenxingming">
					<el-input v-model="ruleForm.laorenxingming" placeholder="老人姓名" clearable  :readonly="ro.laorenxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="老人姓名" prop="laorenxingming">
					<el-input v-model="ruleForm.laorenxingming" placeholder="老人姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="备注" prop="beizhu">
					<el-input v-model="ruleForm.beizhu" placeholder="备注" clearable  :readonly="ro.beizhu"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="备注" prop="beizhu">
					<el-input v-model="ruleForm.beizhu" placeholder="备注" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="护工工号" prop="hugonggonghao">
					<el-input v-model="ruleForm.hugonggonghao" placeholder="护工工号" clearable  :readonly="ro.hugonggonghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="护工工号" prop="hugonggonghao">
					<el-input v-model="ruleForm.hugonggonghao" placeholder="护工工号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="护工姓名" prop="hugongxingming">
					<el-input v-model="ruleForm.hugongxingming" placeholder="护工姓名" clearable  :readonly="ro.hugongxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="护工姓名" prop="hugongxingming">
					<el-input v-model="ruleForm.hugongxingming" placeholder="护工姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="费用" prop="feiyong">
					<el-input v-model="ruleForm.feiyong" placeholder="费用" clearable  :readonly="ro.feiyong"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="费用" prop="feiyong">
					<el-input v-model="ruleForm.feiyong" placeholder="费用" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="textarea" v-if="type!='info'" label="其他" prop="qita">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="其他"
					  v-model="ruleForm.qita" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else-if="ruleForm.qita" label="其他" prop="qita">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"#333","fontWeight":"500","display":"inline-block"}'>{{ruleForm.qita}}</span>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-if="type!='info'"  label="菜肴详情" prop="caiyaoxiangqing">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.caiyaoxiangqing" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else-if="ruleForm.caiyaoxiangqing" label="菜肴详情" prop="caiyaoxiangqing">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#333","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.caiyaoxiangqing"></span>
                </el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto","textAlign":"center","background":"none"}' class="btn">
				<el-button :style='{"border":"0px solid #5c7da0","cursor":"pointer","padding":"0 16px","boxShadow":"inset 0px 0px 0px 0px #5dae8b","margin":"20px 40px 20px 0","color":"#fff","minWidth":"110px","outline":"none","borderRadius":"4px","background":"linear-gradient(180deg, rgba(191,187,233,1) 0%, rgba(139,133,203,1) 50%, rgba(111,100,203,1) 51%, rgba(93,83,181,1) 100%)","width":"auto","lineHeight":"44px","fontSize":"14px","height":"44px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"border":"0px solid #e68888","cursor":"pointer","padding":"0 16px","boxShadow":"inset 0px 0px 0px 0px #ff7676","margin":"0 150px 0 0","color":"#fff","minWidth":"110px","outline":"none","borderRadius":"4px","background":"linear-gradient(180deg, rgba(255,228,218,1) 0%, rgba(246,192,173,1) 50%, rgba(255,151,112,1) 51%, rgba(242,90,32,1) 100%)","width":"auto","lineHeight":"44px","fontSize":"14px","height":"44px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"border":"0px solid #e68888","cursor":"pointer","padding":"0 16px","boxShadow":"inset 0px 0px 0px 0px #ff7676","margin":"0 150px 0 0","color":"#fff","minWidth":"110px","outline":"none","borderRadius":"4px","background":"linear-gradient(180deg, rgba(255,228,218,1) 0%, rgba(246,192,173,1) 50%, rgba(255,151,112,1) 51%, rgba(242,90,32,1) 100%)","width":"auto","lineHeight":"44px","fontSize":"14px","height":"44px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				riqi : false,
				caiyaoxiangqing : false,
				qita : false,
				jiashuzhanghao : false,
				jiashuxingming : false,
				laorenxingming : false,
				beizhu : false,
				hugonggonghao : false,
				hugongxingming : false,
				feiyong : false,
				ispay : false,
			},
			
			
			ruleForm: {
				riqi: '',
				caiyaoxiangqing: '',
				qita: '',
				jiashuzhanghao: '',
				jiashuxingming: '',
				laorenxingming: '',
				beizhu: '',
				hugonggonghao: '',
				hugongxingming: '',
				feiyong: '',
			},
		
			
			rules: {
				riqi: [
				],
				caiyaoxiangqing: [
				],
				qita: [
				],
				jiashuzhanghao: [
				],
				jiashuxingming: [
				],
				laorenxingming: [
				],
				beizhu: [
				],
				hugonggonghao: [
				],
				hugongxingming: [
				],
				feiyong: [
					{ required: true, message: '费用不能为空', trigger: 'blur' },
					{ validator: validateNumber, trigger: 'blur' },
				],
				ispay: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
		this.ruleForm.riqi = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='riqi'){
							this.ruleForm.riqi = obj[o];
							this.ro.riqi = true;
							continue;
						}
						if(o=='caiyaoxiangqing'){
							this.ruleForm.caiyaoxiangqing = obj[o];
							this.ro.caiyaoxiangqing = true;
							continue;
						}
						if(o=='qita'){
							this.ruleForm.qita = obj[o];
							this.ro.qita = true;
							continue;
						}
						if(o=='jiashuzhanghao'){
							this.ruleForm.jiashuzhanghao = obj[o];
							this.ro.jiashuzhanghao = true;
							continue;
						}
						if(o=='jiashuxingming'){
							this.ruleForm.jiashuxingming = obj[o];
							this.ro.jiashuxingming = true;
							continue;
						}
						if(o=='laorenxingming'){
							this.ruleForm.laorenxingming = obj[o];
							this.ro.laorenxingming = true;
							continue;
						}
						if(o=='beizhu'){
							this.ruleForm.beizhu = obj[o];
							this.ro.beizhu = true;
							continue;
						}
						if(o=='hugonggonghao'){
							this.ruleForm.hugonggonghao = obj[o];
							this.ro.hugonggonghao = true;
							continue;
						}
						if(o=='hugongxingming'){
							this.ruleForm.hugongxingming = obj[o];
							this.ro.hugongxingming = true;
							continue;
						}
						if(o=='feiyong'){
							this.ruleForm.feiyong = obj[o];
							this.ro.feiyong = true;
							continue;
						}
				}
				











			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `meiyuecanyin/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.caiyaoxiangqing = this.ruleForm.caiyaoxiangqing.replace(reg,'../../../springbootayz12/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "meiyuecanyin/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `meiyuecanyin/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.meiyuecanyinCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `meiyuecanyin/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.meiyuecanyinCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.meiyuecanyinCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  text-shadow: 0 1px 10px #fff;
	  	  color: #666;
	  	  background: none;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 3px ridge #eee;
	  	  border-radius: 4px;
	  	  padding: 0 12px;
	  	  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
	  	  outline: none;
	  	  color: #666;
	  	  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
	  	  display: inline-block;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 300px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 3px ridge #eee;
	  	  border-radius: 4px;
	  	  padding: 0 10px;
	  	  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
	  	  outline: none;
	  	  color: #666;
	  	  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 300px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 3px ridge #eee;
	  	  border-radius: 4px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
	  	  outline: none;
	  	  color: #666;
	  	  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 300px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 3px ridge #eee;
	  	  cursor: pointer;
	  	  border-radius: 4px;
	  	  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
	  	  color: #aaa;
	  	  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 3px ridge #eee;
	  	  cursor: pointer;
	  	  border-radius: 4px;
	  	  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
	  	  color: #aaa;
	  	  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 3px ridge #eee;
	  	  cursor: pointer;
	  	  border-radius: 4px;
	  	  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
	  	  color: #aaa;
	  	  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 3px ridge #eee;
	  	  border-radius: 4px;
	  	  padding: 12px;
	  	  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
	  	  outline: none;
	  	  color: #666;
	  	  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-height: 150px;
	  	  min-width: 640px;
	  	  height: auto;
	  	}
</style>
