window.onload = function () {
    var url = "https://reqres.in/api/users?page=2";

    var table = $('#dataTable2').DataTable( {
        ajax: {
            type: "GET",
            url: url,
            dataType: 'json',
            dataSrc: 'data'
        }
        ,
        columns: [ 
            {data : null },
            {data: 'id'},
            {data: 'email'},
            {data: 'first_name'},
            {data: 'last_name'},
            {data: 'avatar', render: function (data) {
                return '<img src="' + data + '" height="60" width="60"/>';
                }
            },

            ],
        columnDefs: [
            {
                targets : 0,
                orderable: false,
                className: "select-checkbox",
                data: null,
                defaultContent: ''
              }

        ],
         /* 체크박스를 통해서만 행이 선택될 수 있도록 한다.*/
        select: {
            style: "multi",
            selector: "td:first-child"
          },

        initComplete: function(settings, json) {
            $("#checkall").prop("checked",false);
            $("#checkall").click(function(){
                if($(this).prop("checked")){
                    table.rows().select();
                }
                else {
                    $("#dataTable2").rows().deselect();
                }
            });
        }});

};




