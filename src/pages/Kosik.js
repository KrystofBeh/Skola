import CartItem from "../parts/KosikItem.js"

function Kosik ({list, Remove}) {
    return (
        <div className="d-flex flex-column align-items-center">
            <h1 className="my-4">Košík</h1>
            {list.map((polozka) => (
                <CartItem
                    key={polozka.id}
                    Name={polozka.nazev}
                    Cena={polozka.cena}
                    Id={polozka.id}
                    Img={polozka.img}
                    Remove={Remove}
                />
            ))}
        </div>
    )
}

export default Kosik;
