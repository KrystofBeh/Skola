function Item ({Name, Cena, Img, Id, Add}) {
    return (
        <div className="border border-primary p-3 mb-1 mt-2 d-flex align-items-center justify-content-between" style={{ width: "125%" }}>
            <div>
                <h3>{Name}</h3>
                <p>{Cena} Kč</p>
            </div>
            <img src={Img} width={"auto"} height={"100px"}></img>
            <button className="btn btn-success" onClick={() => Add(Id)}>ADD</button>
        </div>
    )
}

export default Item;
