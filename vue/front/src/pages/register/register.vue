<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20221119/e47b609472f14bba85fbe4ea38b2ec99.jpg) no-repeat","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"padding":"30px 40px 40px 40px","boxShadow":"0px 0px 0px #ccc,inset 0px 0px 0px 0px #e0f8e8","margin":"20px 0 0 40%","borderColor":"#1170d2 #08b344 #08b344 #1170d2","borderRadius":"10% 10%","background":"rgba(255,255,255,.8)","borderWidth":"4px","width":"auto","minWidth":"800px","borderStyle":"solid double solid double","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="true" :style='{"width":"100%","margin":"0 0 4px 0","fontSize":"20px","color":"#08b344","textAlign":"center","fontWeight":"bold"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"width":"100%","margin":"0 0 20px 0","fontSize":"20px","color":"#08b344","textAlign":"center","fontWeight":"bold"}'>智慧养老院管理系统注册</p></div>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="hugonggonghao">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>护工工号：</div>
				<el-input v-model="registerForm.hugonggonghao"  placeholder="请输入护工工号" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="hugongxingming">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>护工姓名：</div>
				<el-input v-model="registerForm.hugongxingming"  placeholder="请输入护工姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="xingbie">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in hugongxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="hugongzhaopian">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>护工照片：</div>
                <file-upload
					tip="点击上传护工照片"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.hugongzhaopian?registerForm.hugongzhaopian:''"
					@change="hugonghugongzhaopianUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="nianling">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>年龄：</div>
				<el-input v-model="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="hugongdianhua">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>护工电话：</div>
				<el-input v-model="registerForm.hugongdianhua"  placeholder="请输入护工电话" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="minzu">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>民族：</div>
				<el-input v-model="registerForm.minzu"  placeholder="请输入民族" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="xueli">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>学历：</div>
				<el-input v-model="registerForm.xueli"  placeholder="请输入学历" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="hunfou">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>婚否：</div>
                <el-select v-model="registerForm.hunfou" placeholder="请选择婚否" >
                  <el-option
                      v-for="(item,index) in hugonghunfouOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='hugong'" prop="hulijibie">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>护理级别：</div>
                <el-select v-model="registerForm.hulijibie" placeholder="请选择护理级别" >
                  <el-option
                      v-for="(item,index) in hugonghulijibieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="jiashuzhanghao">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>家属账号：</div>
				<el-input v-model="registerForm.jiashuzhanghao"  placeholder="请输入家属账号" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="mima">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="jiashuxingming">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>家属姓名：</div>
				<el-input v-model="registerForm.jiashuxingming"  placeholder="请输入家属姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="xingbie">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in jiashuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="jiashushouji">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>家属手机：</div>
				<el-input v-model="registerForm.jiashushouji"  placeholder="请输入家属手机" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="shenfenzheng">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>身份证：</div>
				<el-input v-model="registerForm.shenfenzheng"  placeholder="请输入身份证" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="jiatingzhuzhi">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>家庭住址：</div>
				<el-input v-model="registerForm.jiatingzhuzhi"  placeholder="请输入家庭住址" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0px auto 24px","height":"auto"}' v-if="tableName=='jiashu'" prop="touxiang">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="jiashutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0px","boxShadow":"1px 2px 3px #aaa","margin":"12px 16px 5px 236px","color":"#fff","display":"inline-block","outline":"none","borderRadius":"4px","background":"linear-gradient(180deg, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%)","width":"128px","fontSize":"16px","height":"40px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"1px solid #bbb","cursor":"pointer","padding":"0px","boxShadow":"1px 2px 3px #ccc","margin":"12px auto 5px","color":"#999","display":"inline-block","outline":"none","borderRadius":"4px","background":"#fff","width":"128px","fontSize":"16px","height":"40px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 10%","color":"#08b344","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {
                xingbie: '',
                hunfou: '',
                hulijibie: '',
                xingbie: '',
            },
			rules: {},
            hugongxingbieOptions: [],
            hugonghunfouOptions: [],
            hugonghulijibieOptions: [],
            jiashuxingbieOptions: [],
		}
    },
	mounted() {
	},
    created() {
      this.pageFlag = this.$route.query.pageFlag;
      this.tableName = this.$route.query.role;
      if ('hugong' == this.tableName) {
        this.rules.hugonggonghao = [{ required: true, message: '请输入护工工号', trigger: 'blur' }];
      }
      if ('hugong' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
      if ('hugong' == this.tableName) {
        this.rules.hugongxingming = [{ required: true, message: '请输入护工姓名', trigger: 'blur' }];
      }
        this.hugongxingbieOptions = "男,女".split(',');
      if ('hugong' == this.tableName) {
        this.rules.nianling = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
      }
      if ('hugong' == this.tableName) {
        this.rules.hugongdianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
        this.hugonghunfouOptions = "未婚,已婚".split(',');
        this.hugonghulijibieOptions = "特级护理,一级护理,二级护理,三级护理".split(',');
      if ('hugong' == this.tableName) {
        this.rules.hulijibie = [{ required: true, message: '请输入护理级别', trigger: 'blur' }];
      }
      if ('jiashu' == this.tableName) {
        this.rules.jiashuzhanghao = [{ required: true, message: '请输入家属账号', trigger: 'blur' }];
      }
      if ('jiashu' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
        this.jiashuxingbieOptions = "男,女".split(',');
      if ('jiashu' == this.tableName) {
        this.rules.jiashushouji = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('jiashu' == this.tableName) {
        this.rules.shenfenzheng = [{ required: true, validator: this.$validate.isIdCard, trigger: 'blur' }];
      }
    },
    //方法集合
    methods: {
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      hugonghugongzhaopianUploadChange(fileUrls) {
          this.registerForm.hugongzhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      jiashutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
               if(`hugong` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
               if(`jiashu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20221119/e47b609472f14bba85fbe4ea38b2ec99.jpg) no-repeat;

		.el-date-editor.el-input {
			width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 0px solid #eacb96;
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: 0px 2px 0px #08b344;
						outline: none;
						color: #999;
						background: #fff;
						width: 100%;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 0px solid #eacb96;
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: 0px 2px 0px #08b344;
						outline: none;
						color: #999;
						background: #fff;
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0px solid #eacb96;
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: 0px 2px 0px #08b344;
						outline: none;
						color: #999;
						background: #fff;
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0px solid #eacb96;
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: 0px 2px 0px #08b344;
						outline: none;
						color: #999;
						background: #fff;
						width: 288px;
						font-size: 14px;
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
		  		  border: 1px dashed #08b344;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #08b344;
		  		  background: #Fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  text-align: center;
		  		  height: 120px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px dashed #08b344;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #08b344;
		  		  background: #Fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  text-align: center;
		  		  height: 120px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px dashed #08b344;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #08b344;
		  		  background: #Fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  text-align: center;
		  		  height: 120px;
		  		}
	}
</style>
