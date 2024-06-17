<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","padding":"120px 0","alignItems":"center","background":"url(http://codegen.caihongy.cn/20230220/fe8de165616e4a958fb1e289132234fa.jpg) no-repeat center bottom / 100% auto","display":"block","width":"100%","position":"relative","justifyContent":"center"}'>
			<el-form v-if="pageFlag=='register'" :style='{"padding":"40px 40px 40px","margin":"0 auto","borderColor":"#849acf","borderRadius":"10px","flexWrap":"wrap","background":"rgba(255,255,255,1)","borderWidth":"10px","display":"flex","width":"800px","borderStyle":"outset","justifyContent":"center","height":"auto"}' ref="rgsForm" class="rgs-form" :model="rgsForm">
				<div v-if="true" :style='{"padding":"0 40px","margin":"0 0 30px 0","color":"#fff","textAlign":"center","overflow":"hidden","top":"0","left":"0","background":"url(http://codegen.caihongy.cn/20230220/93da8688dea64d828ade3cf330fa6af5.png) no-repeat left bottom / auto 100%,url(http://codegen.caihongy.cn/20230220/567a2d3b7488444c893461a5b89e87e8.png) no-repeat right bottom / auto 100%,#0d3084","width":"100%","lineHeight":"64px","fontSize":"24px","position":"absolute","height":"64px"}' class="title">智慧养老院管理系统注册</div>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">护工工号</div>
					<el-input  v-model="ruleForm.hugonggonghao"  autocomplete="off" placeholder="护工工号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">护工姓名</div>
					<el-input  v-model="ruleForm.hugongxingming"  autocomplete="off" placeholder="护工姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in hugongxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">护工照片</div>
                    <file-upload
                        tip="点击上传护工照片"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.hugongzhaopian?ruleForm.hugongzhaopian:''"
                        @change="hugonghugongzhaopianUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">年龄</div>
					<el-input  v-model="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">护工电话</div>
					<el-input  v-model="ruleForm.hugongdianhua"  autocomplete="off" placeholder="护工电话"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">民族</div>
					<el-input  v-model="ruleForm.minzu"  autocomplete="off" placeholder="民族"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">学历</div>
					<el-input  v-model="ruleForm.xueli"  autocomplete="off" placeholder="学历"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">婚否</div>
                    <el-select v-model="ruleForm.hunfou" placeholder="请选择婚否" >
                        <el-option
                            v-for="(item,index) in hugonghunfouOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='hugong'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">护理级别</div>
                    <el-select v-model="ruleForm.hulijibie" placeholder="请选择护理级别" >
                        <el-option
                            v-for="(item,index) in hugonghulijibieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">家属账号</div>
					<el-input  v-model="ruleForm.jiashuzhanghao"  autocomplete="off" placeholder="家属账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">家属姓名</div>
					<el-input  v-model="ruleForm.jiashuxingming"  autocomplete="off" placeholder="家属姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in jiashuxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">家属手机</div>
					<el-input  v-model="ruleForm.jiashushouji"  autocomplete="off" placeholder="家属手机"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">身份证</div>
					<el-input  v-model="ruleForm.shenfenzheng"  autocomplete="off" placeholder="身份证"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">家庭住址</div>
					<el-input  v-model="ruleForm.jiatingzhuzhi"  autocomplete="off" placeholder="家庭住址"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 auto 15px","flexWrap":"wrap","display":"block","width":"60%","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='jiashu'">
					<div v-if="true" :style='{"color":"#0d3084","left":"-130px","textAlign":"right","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","fontWeight":"600"}' class="lable">头像</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="jiashutouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<button :style='{"border":"0px solid #f4ca93","cursor":"pointer","padding":"0","margin":"0 auto","borderColor":"#fff","color":"#fff","bottom":"0","display":"block","letterSpacing":"4px","minWidth":"150px","right":"0","outline":"none","borderRadius":"0px","background":"url(http://codegen.caihongy.cn/20230220/58c97d1b7dcd474d8bb0e0aaf358fc33.png) no-repeat left bottom / auto 100%,url(http://codegen.caihongy.cn/20230220/593adc3e479e4050bf3aaf94529768f8.png) no-repeat right bottom / auto 100%,#0d3084","borderWidth":"1px 0 0","width":"100%","fontSize":"24px","position":"absolute","borderStyle":"solid","height":"64px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0","margin":"20px auto 0","color":"#666","display":"block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"underline"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>

export default {
	data() {
		return {
			ruleForm: {
                xingbie: '',
                hunfou: '',
                hulijibie: '',
                xingbie: '',
			},

            pageFlag : '',
			tableName:"",
			rules: {},
            hugongxingbieOptions: [],
            hugonghunfouOptions: [],
            hugonghulijibieOptions: [],
            jiashuxingbieOptions: [],
		};
	},
	mounted(){
        this.pageFlag = this.$storage.get("pageFlag");
		let table = this.$storage.get("loginTable");
		this.tableName = table;
        this.hugongxingbieOptions = "男,女".split(',')
        this.hugonghunfouOptions = "未婚,已婚".split(',')
        this.hugonghulijibieOptions = "特级护理,一级护理,二级护理,三级护理".split(',')
        this.jiashuxingbieOptions = "男,女".split(',')
	},
	created() {
    
	},
	destroyed() {
		  	},
	methods: {
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        hugonghugongzhaopianUploadChange(fileUrls) {
            this.ruleForm.hugongzhaopian = fileUrls;
        },
        jiashutouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.hugonggonghao) && `hugong` == this.tableName){
						this.$message.error(`护工工号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `hugong` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `hugong` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if((!this.ruleForm.hugongxingming) && `hugong` == this.tableName){
						this.$message.error(`护工姓名不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
            if(this.ruleForm.hugongzhaopian!=null) {
                this.ruleForm.hugongzhaopian = this.ruleForm.hugongzhaopian.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`hugong` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
						this.$message.error(`年龄应输入整数`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`hugong` == this.tableName && this.ruleForm.hugongdianhua&&(!this.$validate.isMobile(this.ruleForm.hugongdianhua))){
						this.$message.error(`护工电话应输入手机格式`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.hulijibie) && `hugong` == this.tableName){
						this.$message.error(`护理级别不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
				
					if((!this.ruleForm.jiashuzhanghao) && `jiashu` == this.tableName){
						this.$message.error(`家属账号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `jiashu` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `jiashu` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`jiashu` == this.tableName && this.ruleForm.jiashushouji&&(!this.$validate.isMobile(this.ruleForm.jiashushouji))){
						this.$message.error(`家属手机应输入手机格式`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					if(`jiashu` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
						this.$message.error(`身份证应输入身份证格式`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
				
			
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20230220/fe8de165616e4a958fb1e289132234fa.jpg) no-repeat center bottom / 100% auto;

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px;
						margin: 0;
						color: #666;
						background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
						width: 100%;
						font-size: 14px;
						border-color: #eee;
						border-width: 3px;
						border-style: ridge;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 0px solid #333;
						border-radius: 4px;
						padding: 0 10px;
						outline: none;
						color: #999;
						background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
						width: 100%;
						font-size: 14px;
						border-color: #eee;
						border-width: 3px;
						border-style: ridge;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #999;
						background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
						width: 100%;
						font-size: 14px;
						border-color: #eee;
						border-width: 3px;
						border-style: ridge;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #999;
						background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
						width: 100%;
						font-size: 14px;
						border-color: #eee;
						border-width: 3px;
						border-style: ridge;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 3px ridge #eee;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  margin: 10px 0;
		  		  color: #999;
		  		  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 3px ridge #eee;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  margin: 10px 0;
		  		  color: #999;
		  		  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 3px ridge #eee;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  margin: 10px 0;
		  		  color: #999;
		  		  background: linear-gradient(30deg, rgba(227,231,242,1) 0%, rgba(255,255,255,1) 20%, rgba(255,255,255,1) 80%, rgba(227,231,242,1) 100%);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
	}
</style>
