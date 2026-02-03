class ArchiveMenu(
    private val archives: MutableList<Archive>
) {

    fun show() {
        var exit = false

        while (!exit) {
            val items = mutableListOf<MenuItem>()

            items.add(
                MenuItem("Создать архив") {
                    CreateArchiveMenu(archives).show()
                }
            )

            for (archive in archives) {
                items.add(
                    MenuItem(archive.title) {
                        NoteMenu(archive).show()
                    }
                )
            }

            items.add(
                MenuItem("Выход") {
                    exit = true
                }
            )

            Menu(
                title = "Архивы",
                items = items
            ).show()
        }
    }
}
