import { Link } from "react-router-dom";

function Navigace() {
    return (
        <ul className="nav nav-tabs">
            <li className="nav-item px-1">
                <Link className="nav-link" to="/">Domů</Link>
            </li>
            <li className="nav-item px-1">
                <Link className="nav-link" to="/katalog">Katalog</Link>
            </li>
            <li className="nav-item px-1">
                <Link className="nav-link" to="/kosik">Košík</Link>
            </li>
        </ul>
    );
}

export default Navigace;
