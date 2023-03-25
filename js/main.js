window.onload = function () {
    var url = "https://reqres.in/api/users?page=2";

    var table = $('#dataTable2').DataTable({
        ajax: {
            type: "GET",
            url: url,
            dataType: 'json',
            dataSrc: 'data'
        }
        ,
        columns: [ 
            {className: "dt-body-center" },
            {data: 'id'},
            {data: 'email'},
            {data: 'first_name'},
            {data: 'last_name'},
            {data: 'avatar', render: function (data) {
                return '<img src="' + data + '" height="60" width="60"/>';
                }
            }

            ],
        columnDefs: [
            {
                targets : 0,
                orderable: false,
                className: "dt-body-center",
                render: function (data, type, full, meta){
                    return '<input type="checkbox" name="id[]" value="' 
                       + $('<div/>').text(data).html() + '">';
                }

    }],
    'order': [1, 'asc'],

   });

   // Handle click on "Select all" control
   $('#main-select-all').on('click', function(){
    // Check/uncheck all checkboxes in the table
    var rows = table.rows({ 'search': 'applied' }).nodes();
    $('input[type="checkbox"]', rows).prop('checked', this.checked);
 });

 // Handle click on checkbox to set state of "Select all" control
 $('#example tbody').on('change', 'input[type="checkbox"]', function(){
    // If checkbox is not checked
    if(!this.checked){
       var el = $('#main-select-all').get(0);
       // If "Select all" control is checked and has 'indeterminate' property
       if(el && el.checked && ('indeterminate' in el)){
          // Set visual state of "Select all" control 
          // as 'indeterminate'
          el.indeterminate = true;
       }
    }
 });
  
 $('#frm-example').on('submit', function(e){
    var form = this;

    // Iterate over all checkboxes in the table
    table.$('input[type="checkbox"]').each(function(){
       // If checkbox doesn't exist in DOM
       if(!$.contains(document, this)){
          // If checkbox is checked
          if(this.checked){
             // Create a hidden element 
             $(form).append(
                $('<input>')
                   .attr('type', 'hidden')
                   .attr('name', this.name)
                   .val(this.value)
             );
          }
       } 
    });

    // FOR TESTING ONLY
    
    // Output form data to a console
    $('#example-console').text($(form).serialize()); 
    console.log("Form submission", $(form).serialize()); 
     
    // Prevent actual form submission
    e.preventDefault();
 });

 // 선택한 테이블 토글
 $('#dataTable2').on( 'click', 'tr', function () {
    $(this).toggleClass('selected');
} );

};




