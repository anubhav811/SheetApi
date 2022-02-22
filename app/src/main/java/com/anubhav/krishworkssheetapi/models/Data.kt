package com.anubhav.krishworkssheetapi.models

data class Data(
    val columnMetadata: List<ColumnMetadata>,
    val rowData: List<RowData>,
    val rowMetadata: List<RowMetadata>
)