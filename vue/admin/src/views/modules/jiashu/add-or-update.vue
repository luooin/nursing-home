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
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="家属账号" prop="jiashuzhanghao">
					<el-input v-model="ruleForm.jiashuzhanghao" placeholder="家属账号" clearable  :readonly="ro.jiashuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="家属账号" prop="jiashuzhanghao">
					<el-input v-model="ruleForm.jiashuzhanghao" placeholder="家属账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="密码" prop="mima">
					<el-input v-model="ruleForm.mima" placeholder="密码" clearable  :readonly="ro.mima"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="密码" prop="mima">
					<el-input v-model="ruleForm.mima" placeholder="密码" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="家属姓名" prop="jiashuxingming">
					<el-input v-model="ruleForm.jiashuxingming" placeholder="家属姓名" clearable  :readonly="ro.jiashuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="家属姓名" prop="jiashuxingming">
					<el-input v-model="ruleForm.jiashuxingming" placeholder="家属姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="select" v-if="type!='info'"  label="性别" prop="xingbie">
					<el-select :disabled="ro.xingbie" v-model="ruleForm.xingbie" placeholder="请选择性别" >
						<el-option
							v-for="(item,index) in xingbieOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="性别" prop="xingbie">
					<el-input v-model="ruleForm.xingbie"
						placeholder="性别" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="家属手机" prop="jiashushouji">
					<el-input v-model="ruleForm.jiashushouji" placeholder="家属手机" clearable  :readonly="ro.jiashushouji"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="家属手机" prop="jiashushouji">
					<el-input v-model="ruleForm.jiashushouji" placeholder="家属手机" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="身份证" prop="shenfenzheng">
					<el-input v-model="ruleForm.shenfenzheng" placeholder="身份证" clearable  :readonly="ro.shenfenzheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="身份证" prop="shenfenzheng">
					<el-input v-model="ruleForm.shenfenzheng" placeholder="身份证" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="input" v-if="type!='info'"  label="家庭住址" prop="jiatingzhuzhi">
					<el-input v-model="ruleForm.jiatingzhuzhi" placeholder="家庭住址" clearable  :readonly="ro.jiatingzhuzhi"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' v-else class="input" label="家庭住址" prop="jiatingzhuzhi">
					<el-input v-model="ruleForm.jiatingzhuzhi" placeholder="家庭住址" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="upload" v-if="type!='info' && !ro.touxiang" label="头像" prop="touxiang">
					<file-upload
						tip="点击上传头像"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
						@change="touxiangUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0px","boxShadow":"0px 0px 0px 0px #d2b3aa","margin":"0 0 20px 0","borderColor":"#d3a7be","borderRadius":"0px","background":"none","borderWidth":"0px","display":"block","width":"100%","minWidth":"500px","borderStyle":"solid"}' class="upload" v-else-if="ruleForm.touxiang" label="头像" prop="touxiang">
					<img v-if="ruleForm.touxiang.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.touxiang.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.touxiang.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
			</template>
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
				jiashuzhanghao : false,
				mima : false,
				jiashuxingming : false,
				xingbie : false,
				jiashushouji : false,
				shenfenzheng : false,
				jiatingzhuzhi : false,
				touxiang : false,
			},
			
			
			ruleForm: {
				jiashuzhanghao: '',
				mima: '',
				jiashuxingming: '',
				xingbie: '',
				jiashushouji: '',
				shenfenzheng: '',
				jiatingzhuzhi: '',
				touxiang: '',
			},
		
			xingbieOptions: [],
			
			rules: {
				jiashuzhanghao: [
					{ required: true, message: '家属账号不能为空', trigger: 'blur' },
				],
				mima: [
					{ required: true, message: '密码不能为空', trigger: 'blur' },
				],
				jiashuxingming: [
				],
				xingbie: [
				],
				jiashushouji: [
					{ validator: validateMobile, trigger: 'blur' },
				],
				shenfenzheng: [
					{ validator: validateIdCard, trigger: 'blur' },
				],
				jiatingzhuzhi: [
				],
				touxiang: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
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
						if(o=='jiashuzhanghao'){
							this.ruleForm.jiashuzhanghao = obj[o];
							this.ro.jiashuzhanghao = true;
							continue;
						}
						if(o=='mima'){
							this.ruleForm.mima = obj[o];
							this.ro.mima = true;
							continue;
						}
						if(o=='jiashuxingming'){
							this.ruleForm.jiashuxingming = obj[o];
							this.ro.jiashuxingming = true;
							continue;
						}
						if(o=='xingbie'){
							this.ruleForm.xingbie = obj[o];
							this.ro.xingbie = true;
							continue;
						}
						if(o=='jiashushouji'){
							this.ruleForm.jiashushouji = obj[o];
							this.ro.jiashushouji = true;
							continue;
						}
						if(o=='shenfenzheng'){
							this.ruleForm.shenfenzheng = obj[o];
							this.ro.shenfenzheng = true;
							continue;
						}
						if(o=='jiatingzhuzhi'){
							this.ruleForm.jiatingzhuzhi = obj[o];
							this.ro.jiatingzhuzhi = true;
							continue;
						}
						if(o=='touxiang'){
							this.ruleForm.touxiang = obj[o];
							this.ro.touxiang = true;
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
			
            this.xingbieOptions = "男,女".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `jiashu/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
















	if(this.ruleForm.touxiang!=null) {
		this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
	}

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
				url: "jiashu/page", 
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
					   url: `jiashu/${!this.ruleForm.id ? "save" : "update"}`,
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
						 this.parent.jiashuCrossAddOrUpdateFlag = false;
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
			   url: `jiashu/${!this.ruleForm.id ? "save" : "update"}`,
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
				 this.parent.jiashuCrossAddOrUpdateFlag = false;
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
      this.parent.jiashuCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    touxiangUploadChange(fileUrls) {
	    this.ruleForm.touxiang = fileUrls;
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
