new Vue({
    el: '#chicken_txt',
    data () {
        return {
            info: null
        }
    },
    mounted () {
        axios
            .get('/chickenmsg')
            .then(response => (this.info = response.data.msg))
            .catch(function (error) { // 请求失败处理
                console.log(error);
            });
    }
})

new Vue({
    el: '#app',
    data: function() {
        return { visible: false }
    }
})