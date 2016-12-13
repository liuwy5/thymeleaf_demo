/**
 * Created by ubuntu on 16-12-12.
 */
$(document).ready(function(){
    $('#loginButton').click(function(){
        var name = $('#name').val();
        var password = $('#password').val();

        if ('' == name) {
            $('.login-alert').html("请输入用户名");
            return false;
        } else if ('' == password) {
            $('.login-alert').html("请输入密码");
            return false;
        }
        // $.ajax({
        //     url: "/login/auth",
        //     type: 'post',
        //     data: $('#loginForm').serialize(),
        //     success: function (data) {
        //         // $('#area').html('12344565677');
        //     }
        // });
    });
});
