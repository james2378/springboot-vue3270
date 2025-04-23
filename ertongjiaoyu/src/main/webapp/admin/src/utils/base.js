const base = {
    get() {
        return {
            url : "http://localhost:8080/ertongjiaoyu/",
            name: "ertongjiaoyu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ertongjiaoyu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "儿童教育网站"
        } 
    }
}
export default base
