package henry.co.bottom.navigtion

interface SpaceOnClickListener {

    fun onCentreButtonClick()

    fun onItemClick(itemIndex: Int, itemName: String)

    fun onItemReselected(itemIndex: Int, itemName: String)
}
