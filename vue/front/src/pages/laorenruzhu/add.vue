<template>
<div :style='{"border":"1px solid #9ce3b5","padding":"20px","boxShadow":"0px 2px 6px #ccc,inset 0px 0px 600px 0px #e0f8e8","margin":"20px auto 0","borderRadius":"16px","background":"#fff","width":"1200px","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="入住编号" prop="ruzhubianhao">
              <el-input v-model="ruleForm.ruzhubianhao" placeholder="入住编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="房间号" prop="fangjianhao">
            <el-input v-model="ruleForm.fangjianhao" 
                placeholder="房间号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="楼房名称" prop="loufangmingcheng">
            <el-input v-model="ruleForm.loufangmingcheng" 
                placeholder="楼房名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="床位号" prop="chuangweihao">
            <el-input v-model="ruleForm.chuangweihao" 
                placeholder="床位号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="老人姓名" prop="laorenxingming">
            <el-input v-model="ruleForm.laorenxingming" 
                placeholder="老人姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="老人照片" v-if="type!='cross' || (type=='cross' && !ro.laorenzhaopian)" prop="laorenzhaopian">
            <file-upload
            tip="点击上传老人照片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.laorenzhaopian?ruleForm.laorenzhaopian:''"
            @change="laorenzhaopianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' class="upload" v-else label="老人照片" prop="laorenzhaopian">
                <img v-if="ruleForm.laorenzhaopian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.laorenzhaopian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.laorenzhaopian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}'  label="老人性别" prop="laorenxingbie">
            <el-select v-model="ruleForm.laorenxingbie" placeholder="请选择老人性别"  >
              <el-option
                  v-for="(item,index) in laorenxingbieOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="老人年龄" prop="laorennianling">
            <el-input v-model="ruleForm.laorennianling" 
                placeholder="老人年龄" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="家属账号" prop="jiashuzhanghao">
            <el-select  @change="jiashuzhanghaoChange" v-model="ruleForm.jiashuzhanghao" placeholder="请选择家属账号">
              <el-option
                  v-for="(item,index) in jiashuzhanghaoOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="家属姓名" prop="jiashuxingming">
            <el-input v-model="ruleForm.jiashuxingming" 
                placeholder="家属姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="家属手机" prop="jiashushouji">
            <el-input v-model="ruleForm.jiashushouji" 
                placeholder="家属手机" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="关系" prop="guanxi">
            <el-input v-model="ruleForm.guanxi" 
                placeholder="关系" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="护工工号" prop="hugonggonghao">
            <el-input v-model="ruleForm.hugonggonghao" 
                placeholder="护工工号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="护工姓名" prop="hugongxingming">
            <el-input v-model="ruleForm.hugongxingming" 
                placeholder="护工姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="护理级别" prop="hulijibie">
            <el-input v-model="ruleForm.hulijibie" 
                placeholder="护理级别" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="入住时间" prop="ruzhushijian" >
              <el-date-picker
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.ruzhushijian" 
                  type="date"
                  placeholder="入住时间">
              </el-date-picker> 
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}'  label="退房状态" prop="tuifangzhuangtai">
            <el-select v-model="ruleForm.tuifangzhuangtai" placeholder="请选择退房状态" disabled >
              <el-option
                  v-for="(item,index) in tuifangzhuangtaiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="入住费用" prop="ruzhufeiyong">
            <el-input v-model="ruleForm.ruzhufeiyong" 
                placeholder="入住费用" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="护理费用" prop="hulifeiyong">
            <el-input v-model="ruleForm.hulifeiyong" 
                placeholder="护理费用" clearable ></el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"20px 0 20px 0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"1px 2px 3px #aaa","margin":"0 20px 0 0","color":"#fff","outline":"none","borderRadius":"4px","background":"linear-gradient(180deg, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #bbb","cursor":"pointer","padding":"0","boxShadow":"1px 2px 6px #ccc","margin":"0","color":"#999","outline":"none","borderRadius":"4px","background":"#fff","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            ruzhubianhao : false,
            fangjianhao : false,
            loufangmingcheng : false,
            chuangweihao : false,
            laorenxingming : false,
            laorenzhaopian : false,
            laorenxingbie : false,
            laorennianling : false,
            jiashuzhanghao : false,
            jiashuxingming : false,
            jiashushouji : false,
            guanxi : false,
            hugonggonghao : false,
            hugongxingming : false,
            hulijibie : false,
            ruzhushijian : false,
            tuifangzhuangtai : false,
            ruzhufeiyong : false,
            hulifeiyong : false,
            ispay : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          ruzhubianhao: this.getUUID(),
          fangjianhao: '',
          loufangmingcheng: '',
          chuangweihao: '',
          laorenxingming: '',
          laorenzhaopian: '',
          laorenxingbie: '',
          laorennianling: '',
          jiashuzhanghao: '',
          jiashuxingming: '',
          jiashushouji: '',
          guanxi: '',
          hugonggonghao: '',
          hugongxingming: '',
          hulijibie: '',
          ruzhushijian: '',
          tuifangzhuangtai: '未退房',
          ruzhufeiyong: '',
          hulifeiyong: '',
          ispay: '',
        },
        laorenxingbieOptions: [],
        jiashuzhanghaoOptions: [],
        tuifangzhuangtaiOptions: [],
        rules: {
          ruzhubianhao: [
          ],
          fangjianhao: [
          ],
          loufangmingcheng: [
          ],
          chuangweihao: [
          ],
          laorenxingming: [
          ],
          laorenzhaopian: [
          ],
          laorenxingbie: [
          ],
          laorennianling: [
          ],
          jiashuzhanghao: [
          ],
          jiashuxingming: [
          ],
          jiashushouji: [
          ],
          guanxi: [
          ],
          hugonggonghao: [
          ],
          hugongxingming: [
          ],
          hulijibie: [
          ],
          ruzhushijian: [
          ],
          tuifangzhuangtai: [
          ],
          ruzhufeiyong: [
            { required: true, message: '入住费用不能为空', trigger: 'blur' },
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          hulifeiyong: [
            { required: true, message: '护理费用不能为空', trigger: 'blur' },
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          ispay: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.ruzhushijian = this.getCurDate()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='ruzhubianhao'){
              this.ruleForm.ruzhubianhao = obj[o];
              this.ro.ruzhubianhao = true;
              continue;
            }
            if(o=='fangjianhao'){
              this.ruleForm.fangjianhao = obj[o];
              this.ro.fangjianhao = true;
              continue;
            }
            if(o=='loufangmingcheng'){
              this.ruleForm.loufangmingcheng = obj[o];
              this.ro.loufangmingcheng = true;
              continue;
            }
            if(o=='chuangweihao'){
              this.ruleForm.chuangweihao = obj[o];
              this.ro.chuangweihao = true;
              continue;
            }
            if(o=='laorenxingming'){
              this.ruleForm.laorenxingming = obj[o];
              this.ro.laorenxingming = true;
              continue;
            }
            if(o=='laorenzhaopian'){
              this.ruleForm.laorenzhaopian = obj[o].split(",")[0];
              this.ro.laorenzhaopian = true;
              continue;
            }
            if(o=='laorenxingbie'){
              this.ruleForm.laorenxingbie = obj[o];
              this.ro.laorenxingbie = true;
              continue;
            }
            if(o=='laorennianling'){
              this.ruleForm.laorennianling = obj[o];
              this.ro.laorennianling = true;
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
            if(o=='jiashushouji'){
              this.ruleForm.jiashushouji = obj[o];
              this.ro.jiashushouji = true;
              continue;
            }
            if(o=='guanxi'){
              this.ruleForm.guanxi = obj[o];
              this.ro.guanxi = true;
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
            if(o=='hulijibie'){
              this.ruleForm.hulijibie = obj[o];
              this.ro.hulijibie = true;
              continue;
            }
            if(o=='ruzhushijian'){
              this.ruleForm.ruzhushijian = obj[o];
              this.ro.ruzhushijian = true;
              continue;
            }
            if(o=='tuifangzhuangtai'){
              this.ruleForm.tuifangzhuangtai = obj[o];
              this.ro.tuifangzhuangtai = true;
              continue;
            }
            if(o=='ruzhufeiyong'){
              this.ruleForm.ruzhufeiyong = obj[o];
              this.ro.ruzhufeiyong = true;
              continue;
            }
            if(o=='hulifeiyong'){
              this.ruleForm.hulifeiyong = obj[o];
              this.ro.hulifeiyong = true;
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.hugonggonghao!=''&&json.hugonggonghao) || json.hugonggonghao==0){
                this.ruleForm.hugonggonghao = json.hugonggonghao
            }
            if((json.hugongxingming!=''&&json.hugongxingming) || json.hugongxingming==0){
                this.ruleForm.hugongxingming = json.hugongxingming
            }
            if((json.hulijibie!=''&&json.hulijibie) || json.hulijibie==0){
                this.ruleForm.hulijibie = json.hulijibie
            }
          }
        });
        this.laorenxingbieOptions = "男,女".split(',')
        this.$http.get('option/jiashu/jiashuzhanghao', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.jiashuzhanghaoOptions = res.data.data;
          }
        });
        this.tuifangzhuangtaiOptions = "已退房,未退房".split(',')
      },
      // 下二随
      jiashuzhanghaoChange () {
        this.$http.get('follow/jiashu/jiashuzhanghao?columnValue=' + this.ruleForm.jiashuzhanghao, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.jiashuxingming){
              this.ruleForm.jiashuxingming = res.data.data.jiashuxingming
            }
            if(res.data.data.jiashushouji){
              this.ruleForm.jiashushouji = res.data.data.jiashushouji
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('laorenruzhu/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('laorenruzhu/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('laorenruzhu/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('laorenruzhu/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
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
        this.$router.go(-1);
      },
      laorenzhaopianUploadChange(fileUrls) {
          this.ruleForm.laorenzhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #999;
	  background: #fff;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 14px;
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
	  border: 1px solid #ccc;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  height: auto;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #ccc;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  height: auto;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #ccc;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  height: auto;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #999;
	  background: #fff;
	  width: 400px;
	  font-size: 14px;
	  min-height: 120px;
	}
</style>
