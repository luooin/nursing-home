<template>
  <div
    :style="{
      padding: ' 30px 20px',
      flexWrap: 'wrap',
      background: 'none',
      display: 'flex',
    }"
  >
    <el-form
      :style="{
        padding: '30px 40px 220px',
        boxShadow: '0 0px 0px #999',
        borderRadius: '6px',
        flexWrap: 'wrap',
        background: 'none',
        display: 'flex',
        justifyContent: 'space-between',
      }"
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      label-width="150px"
    >
      <el-row>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="护工工号"
          prop="hugonggonghao"
        >
          <el-input
            v-model="ruleForm.hugonggonghao"
            readonly
            placeholder="护工工号"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="护工姓名"
          prop="hugongxingming"
        >
          <el-input
            v-model="ruleForm.hugongxingming"
            placeholder="护工姓名"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="性别"
          prop="xingbie"
        >
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
              v-for="(item, index) in hugongxingbieOptions"
              v-bind:key="index"
              :label="item"
              :value="item"
            >
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="护工照片"
          prop="hugongzhaopian"
        >
          <file-upload
            tip="点击上传护工照片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.hugongzhaopian ? ruleForm.hugongzhaopian : ''"
            @change="hugonghugongzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="年龄"
          prop="nianling"
        >
          <el-input
            v-model="ruleForm.nianling"
            placeholder="年龄"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="护工电话"
          prop="hugongdianhua"
        >
          <el-input
            v-model="ruleForm.hugongdianhua"
            placeholder="护工电话"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="民族"
          prop="minzu"
        >
          <el-input
            v-model="ruleForm.minzu"
            placeholder="民族"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="学历"
          prop="xueli"
        >
          <el-input
            v-model="ruleForm.xueli"
            placeholder="学历"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="婚否"
          prop="hunfou"
        >
          <el-select v-model="ruleForm.hunfou" placeholder="请选择婚否">
            <el-option
              v-for="(item, index) in hugonghunfouOptions"
              v-bind:key="index"
              :label="item"
              :value="item"
            >
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'hugong'"
          label="护理级别"
          prop="hulijibie"
        >
          <el-select v-model="ruleForm.hulijibie" placeholder="请选择护理级别">
            <el-option
              v-for="(item, index) in hugonghulijibieOptions"
              v-bind:key="index"
              :label="item"
              :value="item"
            >
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'jiashu'"
          label="家属账号"
          prop="jiashuzhanghao"
        >
          <el-input
            v-model="ruleForm.jiashuzhanghao"
            readonly
            placeholder="家属账号"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'jiashu'"
          label="家属姓名"
          prop="jiashuxingming"
        >
          <el-input
            v-model="ruleForm.jiashuxingming"
            placeholder="家属姓名"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'jiashu'"
          label="性别"
          prop="xingbie"
        >
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
              v-for="(item, index) in jiashuxingbieOptions"
              v-bind:key="index"
              :label="item"
              :value="item"
            >
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'jiashu'"
          label="家属手机"
          prop="jiashushouji"
        >
          <el-input
            v-model="ruleForm.jiashushouji"
            placeholder="家属手机"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'jiashu'"
          label="身份证"
          prop="shenfenzheng"
        >
          <el-input
            v-model="ruleForm.shenfenzheng"
            placeholder="身份证"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'jiashu'"
          label="家庭住址"
          prop="jiatingzhuzhi"
        >
          <el-input
            v-model="ruleForm.jiatingzhuzhi"
            placeholder="家庭住址"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'jiashu'"
          label="头像"
          prop="touxiang"
        >
          <file-upload
            tip="点击上传头像"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.touxiang ? ruleForm.touxiang : ''"
            @change="jiashutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item
          :style="{
            padding: '0px',
            boxShadow: '0px 0px 0px 0px #d2b3aa',
            margin: '0 0 20px 0',
            borderColor: '#d3a7be',
            borderRadius: '0px',
            background: 'none',
            borderWidth: '0px',
            display: 'block',
            width: '100%',
            minWidth: '500px',
            borderStyle: 'solid',
          }"
          v-if="flag == 'users'"
          label="用户名"
          prop="username"
        >
          <el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
        </el-form-item>
        <el-form-item
          :style="{
            width: '100%',
            padding: '0',
            margin: '0 auto',
            textAlign: 'center',
            background: 'none',
          }"
        >
          <el-button
            :style="{
              border: '0px solid #5c7da0',
              cursor: 'pointer',
              padding: '0 16px',
              boxShadow: 'inset 0px 0px 0px 0px #5dae8b',
              margin: '20px 40px 20px 0',
              color: '#fff',
              minWidth: '110px',
              outline: 'none',
              borderRadius: '4px',
              background:
                'linear-gradient(180deg, rgba(191,187,233,1) 0%, rgba(139,133,203,1) 50%, rgba(111,100,203,1) 51%, rgba(93,83,181,1) 100%)',
              width: 'auto',
              lineHeight: '44px',
              fontSize: '14px',
              height: '44px',
            }"
            type="primary"
            @click="onUpdateHandler"
            >修 改</el-button
          >
        </el-form-item>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import {
  isNumber,
  isIntNumer,
  isEmail,
  isMobile,
  isPhone,
  isURL,
  checkIdCard,
} from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: "",
      usersFlag: false,
      hugongxingbieOptions: [],
      hugonghunfouOptions: [],
      hugonghulijibieOptions: [],
      jiashuxingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get",
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.hugongxingbieOptions = "男,女".split(",");
    this.hugonghunfouOptions = "未婚,已婚".split(",");
    this.hugonghulijibieOptions = "特级护理,一级护理,二级护理,三级护理".split(
      ","
    );
    this.jiashuxingbieOptions = "男,女".split(",");
  },
  methods: {
    hugonghugongzhaopianUploadChange(fileUrls) {
      this.ruleForm.hugongzhaopian = fileUrls;
    },
    jiashutouxiangUploadChange(fileUrls) {
      this.ruleForm.touxiang = fileUrls;
    },
    onUpdateHandler() {
      if (!this.ruleForm.hugonggonghao && "hugong" == this.flag) {
        this.$message.error("护工工号不能为空");
        return;
      }
      if (!this.ruleForm.mima && "hugong" == this.flag) {
        this.$message.error("密码不能为空");
        return;
      }
      if (!this.ruleForm.hugongxingming && "hugong" == this.flag) {
        this.$message.error("护工姓名不能为空");
        return;
      }
      if (this.ruleForm.hugongzhaopian != null) {
        this.ruleForm.hugongzhaopian = this.ruleForm.hugongzhaopian.replace(
          new RegExp(this.$base.url, "g"),
          ""
        );
      }
      if (
        "hugong" == this.flag &&
        this.ruleForm.nianling &&
        !isIntNumer(this.ruleForm.nianling)
      ) {
        this.$message.error(`年龄应输入整数`);
        return;
      }
      if (
        "hugong" == this.flag &&
        this.ruleForm.hugongdianhua &&
        !isMobile(this.ruleForm.hugongdianhua)
      ) {
        this.$message.error(`护工电话应输入手机格式`);
        return;
      }
      if (!this.ruleForm.hulijibie && "hugong" == this.flag) {
        this.$message.error("护理级别不能为空");
        return;
      }
      if (!this.ruleForm.jiashuzhanghao && "jiashu" == this.flag) {
        this.$message.error("家属账号不能为空");
        return;
      }
      if (!this.ruleForm.mima && "jiashu" == this.flag) {
        this.$message.error("密码不能为空");
        return;
      }
      if (
        "jiashu" == this.flag &&
        this.ruleForm.jiashushouji &&
        !isMobile(this.ruleForm.jiashushouji)
      ) {
        this.$message.error(`家属手机应输入手机格式`);
        return;
      }
      if (
        "jiashu" == this.flag &&
        this.ruleForm.shenfenzheng &&
        !checkIdCard(this.ruleForm.shenfenzheng)
      ) {
        this.$message.error(`身份证应输入身份证格式`);
        return;
      }
      if (this.ruleForm.touxiang != null) {
        this.ruleForm.touxiang = this.ruleForm.touxiang.replace(
          new RegExp(this.$base.url, "g"),
          ""
        );
      }
      if ("users" == this.flag && this.ruleForm.username.trim().length < 1) {
        this.$message.error(`用户名不能为空`);
        return;
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm,
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {},
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    },
  },
};
</script>
<style lang="scss" scoped>
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
  background: linear-gradient(
    30deg,
    rgba(227, 231, 242, 1) 0%,
    rgba(255, 255, 255, 1) 20%,
    rgba(255, 255, 255, 1) 80%,
    rgba(227, 231, 242, 1) 100%
  );
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
  background: linear-gradient(
    30deg,
    rgba(227, 231, 242, 1) 0%,
    rgba(255, 255, 255, 1) 20%,
    rgba(255, 255, 255, 1) 80%,
    rgba(227, 231, 242, 1) 100%
  );
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
  background: linear-gradient(
    30deg,
    rgba(227, 231, 242, 1) 0%,
    rgba(255, 255, 255, 1) 20%,
    rgba(255, 255, 255, 1) 80%,
    rgba(227, 231, 242, 1) 100%
  );
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

.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
  border: 3px ridge #eee;
  cursor: pointer;
  border-radius: 4px;
  box-shadow: inset 0px 0px 0px 0px #e8f9f2;
  color: #aaa;
  background: linear-gradient(
    30deg,
    rgba(227, 231, 242, 1) 0%,
    rgba(255, 255, 255, 1) 20%,
    rgba(255, 255, 255, 1) 80%,
    rgba(227, 231, 242, 1) 100%
  );
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
  background: linear-gradient(
    30deg,
    rgba(227, 231, 242, 1) 0%,
    rgba(255, 255, 255, 1) 20%,
    rgba(255, 255, 255, 1) 80%,
    rgba(227, 231, 242, 1) 100%
  );
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
  background: linear-gradient(
    30deg,
    rgba(227, 231, 242, 1) 0%,
    rgba(255, 255, 255, 1) 20%,
    rgba(255, 255, 255, 1) 80%,
    rgba(227, 231, 242, 1) 100%
  );
  width: auto;
  font-size: 14px;
  min-height: 150px;
  min-width: 640px;
  height: auto;
}
</style>
