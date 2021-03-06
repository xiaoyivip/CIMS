/*input框 换颜色*/
function show_validation_msg(str, type, msg) {

    $(".password-input").removeClass('has-error');
    $(".username-input").removeClass('has-error');
    $(".areaSortNum_input").removeClass('has-error');

    if (type === ("error")) {
        $(str).addClass('has-error');
        $(".glyphicon-warning-sign").show();
        $(".msg").empty().html(msg);
    }
}

$(function () {
    loadLoginUser();
});

/*获取当前登录用户信息*/
function loadLoginUser() {
    $.ajax({
        url: "../user/loginUser",
        type: "GET",
        dataType: "json",
        success: function (data) {
            console.log("**************////////////////" + data);
            if (data.code === 100) {
                $("#loginUser_nav").append(data.extend.loginUser.userName);
                if (data.extend.areaAll != []) {
                    $("#loginUser_nav").append(" [").append($("<small></small>").append(data.extend.areaAll)).append("] ");
                }
            }
        }
    })
}


$("#logout_nav").click(function () {
    logout();
});

/*注销登录*/
function logout() {
    $.ajax({
        url: "../user/logout",
        type: "GET",
        dataType: "json",
        success: function (data) {
            if (data.code === 100) {
                window.location.href = data.target;
            }
        }
    })
}

/*全选*/
$("#check_all").click(function () {
    $(".check_item").prop("checked", $(this).prop("checked"));
});
$(document).on("click", ".check_item", function () {
    var flag = $(".check_item").length == $(".check_item:checked").length;
    $("#check_all").prop("checked", flag)
})