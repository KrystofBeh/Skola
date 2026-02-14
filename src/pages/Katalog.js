import List from "../parts/List"

function Katalog ({list, Add}) {
    return (
        <div className="d-flex flex-column align-items-center">
            <h1 className="my-4">Katalog</h1>
            <List list={list} Add={Add}/>
        </div>
    )
}

export default Katalog;
