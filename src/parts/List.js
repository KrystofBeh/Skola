import Item from "./Item"

function List ({list, Add}) {
    return (
        <div className="p-3">
            {list.map((polozka) => (
                <Item
                    key={polozka.id}
                    Name={polozka.nazev}
                    Cena={polozka.cena}
                    Id={polozka.id}
                    Img={polozka.img}
                    Add={Add}
                />
            ))}
        </div>
    )
}

export default List;
