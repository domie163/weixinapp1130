(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yonghu/add-or-update"],{3971:function(e,n,t){},"7d7a":function(e,n,t){"use strict";t.r(n);var r=t("81ec"),u=t.n(r);for(var o in r)"default"!==o&&function(e){t.d(n,e,(function(){return r[e]}))}(o);n["default"]=u.a},"81ec":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=u(t("a34a"));function u(e){return e&&e.__esModule?e:{default:e}}function o(e,n,t,r,u,o,a){try{var i=e[o](a),s=i.value}catch(c){return void t(c)}i.done?n(s):Promise.resolve(s).then(r,u)}function a(e){return function(){var n=this,t=arguments;return new Promise((function(r,u){var a=e.apply(n,t);function i(e){o(a,r,u,i,s,"next",e)}function s(e){o(a,r,u,i,s,"throw",e)}i(void 0)}))}}var i=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("fe0e"))}.bind(null,t)).catch(t.oe)},s={data:function(){return{cross:"",ro:{username:!1,password:!1,yonghuName:!1,yonghuPhoto:!1,sexTypes:!1,yonghuPhone:!1,yonghuIdNumber:!1,yonghuEmail:!1,yonghuDelete:!1,createTime:!1},ruleForm:{username:"",password:"",yonghuName:"",yonghuPhoto:"",sexTypes:"",sexValue:"",yonghuPhone:"",yonghuIdNumber:"",yonghuEmail:"",yonghuDelete:"",createTime:""},user:{},sexTypesOptions:[],sexTypesIndex:0}},components:{wPicker:i},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(e){var n=this;return a(r.default.mark((function t(){var u,o,a;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return u={page:1,limit:100,dicCode:"sex_types"},t.next=3,n.$api.page("dictionary",u);case 3:if(o=t.sent,n.sexTypesOptions=o.data.list,!e.id){t.next=11;break}return n.ruleForm.id=e.id,t.next=9,n.$api.info("yonghu",n.ruleForm.id);case 9:a=t.sent,n.ruleForm=a.data;case 11:e.yonghuId&&(n.ruleForm.yonghuId=e.yonghuId);case 12:case"end":return t.stop()}}),t)})))()},methods:{sexTypesChange:function(e){this.sexTypesIndex=e.target.value,this.ruleForm.sexValue=this.sexTypesOptions[this.sexTypesIndex].indexName,this.ruleForm.sexTypes=this.sexTypesOptions[this.sexTypesIndex].codeIndex},yonghuPhotoTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.yonghuPhoto=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){}))}))},createTimeConfirm:function(e){console.log(e),this.ruleForm.createTime=e.result,this.$forceUpdate()},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return a(r.default.mark((function t(){return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(n.ruleForm.username){t.next=3;break}return n.$utils.msg("账户不能为空"),t.abrupt("return");case 3:if(n.ruleForm.yonghuName){t.next=6;break}return n.$utils.msg("用户姓名不能为空"),t.abrupt("return");case 6:if(n.ruleForm.yonghuPhoto){t.next=9;break}return n.$utils.msg("头像不能为空"),t.abrupt("return");case 9:if(n.ruleForm.sexTypes){t.next=12;break}return n.$utils.msg("性别不能为空"),t.abrupt("return");case 12:if(n.ruleForm.yonghuPhone||n.$validate.isMobile(n.ruleForm.yonghuPhone)){t.next=15;break}return n.$utils.msg("联系方式不能为空并且需要输入正确格式"),t.abrupt("return");case 15:if(n.ruleForm.yonghuIdNumber||n.$validate.checkIdCard(n.ruleForm.yonghuIdNumber)){t.next=18;break}return n.$utils.msg("用户身份证号不能为空并且需要输入正确格式"),t.abrupt("return");case 18:if(n.ruleForm.yonghuEmail||n.$validate.isEmail(n.ruleForm.yonghuEmail)){t.next=21;break}return n.$utils.msg("邮箱不能为空并且需要输入正确格式"),t.abrupt("return");case 21:if(!n.ruleForm.id){t.next=26;break}return t.next=24,n.$api.update("yonghu",n.ruleForm);case 24:t.next=28;break;case 26:return t.next=28,n.$api.save("yonghu",n.ruleForm);case 28:e.setStorageSync("pingluenStateState",!0),n.$utils.msgBack("提交成功");case 30:case"end":return t.stop()}}),t)})))()},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,u=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,u=u>9?u:"0"+u,"".concat(t,"-").concat(r,"-").concat(u)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,t("543d")["default"])},ade3:function(e,n,t){"use strict";(function(e){t("b839");r(t("66fd"));var n=r(t("f2bd"));function r(e){return e&&e.__esModule?e:{default:e}}wx.__webpack_require_UNI_MP_PLUGIN__=t,e(n.default)}).call(this,t("543d")["createPage"])},c46c:function(e,n,t){"use strict";t.d(n,"b",(function(){return u})),t.d(n,"c",(function(){return o})),t.d(n,"a",(function(){return r}));var r={wPicker:function(){return Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(t.bind(null,"fe0e"))}},u=function(){var e=this,n=e.$createElement;e._self._c},o=[]},c79e:function(e,n,t){"use strict";var r=t("3971"),u=t.n(r);u.a},f2bd:function(e,n,t){"use strict";t.r(n);var r=t("c46c"),u=t("7d7a");for(var o in u)"default"!==o&&function(e){t.d(n,e,(function(){return u[e]}))}(o);t("c79e");var a,i=t("f0c5"),s=Object(i["a"])(u["default"],r["b"],r["c"],!1,null,"346b3d32",null,!1,r["a"],a);n["default"]=s.exports}},[["ade3","common/runtime","common/vendor"]]]);