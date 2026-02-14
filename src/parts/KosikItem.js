function KosikItem ({Name, Cena, Img, Id, Remove}) {
    return (
        <div className="border border-primary p-3 mb-1 mt-2 d-flex align-items-center justify-content-between" style={{ width: "35%" }}>
            <div>
                <h3>{Name}</h3>
                <p>{Cena} Kč</p>
            </div>
            <img src={Img} width={"auto"} height={"100px"}></img>
            <button className="btn btn-danger" onClick={() => Remove(Id)}>DELETE</button>
        </div>
    )
}

export default KosikItem;
