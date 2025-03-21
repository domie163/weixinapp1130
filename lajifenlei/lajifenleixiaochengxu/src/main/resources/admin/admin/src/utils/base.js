const base = {
    get() {
        return {
            url : "http://localhost:8080/lajifenleixiaochengxu/",
            name: "lajifenleixiaochengxu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/lajifenleixiaochengxu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "垃圾分类小程序"
        } 
    }
}
export default base
