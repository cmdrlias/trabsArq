$.fn.DataTable.ext.pager.numbers_length = 5;

function loadDataTable(orderBy) {
    $('#datatable').DataTable({
      "pagingType": "simple_numbers",
      "lengthMenu": [
        [10, 25, 50, -1],
        [10, 25, 50, ""]
      ],
      "order" : orderBy,
      responsive: true,
      language: {
        search:            "_INPUT_",
        processing:        "",
        loadingRecords:    "",
        searchPlaceholder: "",
        lengthMenu:        "",
        info:              "",
        infoEmpty:         "",
        infoFiltered:      "",
        infoPostFix:       "",
        zeroRecords:       "",
        emptyTable:        "",
        paginate: {
            first:         "",
            previous:      "",
            next:          "",
            last:          ""
        },
        aria: {
            sortAscending: "",
            sortDescending: ""
        },
      }
    });
}