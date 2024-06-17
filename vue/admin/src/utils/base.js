const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootayz12/",
            name: "springbootayz12",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootayz12/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧养老院管理系统"
        } 
    }
}
export default base
