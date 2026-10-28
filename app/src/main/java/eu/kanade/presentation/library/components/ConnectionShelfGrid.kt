package eu.kanade.presentation.library.components

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.ui.unit.dp

private val ShelfAutoGridCellWidth = 150.dp

/**
 * Sizes the grid used by connection library shelves. An explicit column count chosen by the user
 * wins; otherwise cells adapt with a larger minimum width so comic covers stay big (about two
 * columns on phones and five on tablets instead of three and six).
 */
internal fun connectionShelfGridCells(columns: Int): GridCells {
    val coercedColumns = columns.coerceIn(0, 10)
    return if (coercedColumns > 0) {
        GridCells.Fixed(coercedColumns)
    } else {
        GridCells.Adaptive(ShelfAutoGridCellWidth)
    }
}
