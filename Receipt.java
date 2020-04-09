class Receipt
{
    List<Items> itemsList;

    public void addItemsList(String article) {
        itemsList.add(article);
    }
    public void removeItemsList(int which) {
        itemsList.remove(which);
    }
}