import Home from './pages/Home';
import Catalog from './pages/Katalog.js';
import Cart from './pages/Kosik.js';
import Navigation from './parts/Navigace.js';
import { useState } from "react";

import { BrowserRouter, Routes, Route } from "react-router-dom"

function App() {
    const [polozky] = useState(
        [
            {
                id: 1,
                nazev: "kocka",
                cena: "1",
                img: "https://www.purina.cz/sites/default/files/2024-01/chartreux%20header%20%281%29_0.jpg"
            },
            {
                id: 2,
                nazev: "Pravé letadlo",
                cena: "1000",
                img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdp-LKRagBnb8-2VAWYqQmTLh0vU5KjtSkFQ&s"
            }
        ]
    )

    const [kosik, nastavKosik] = useState([])

    const pridatDoKosiku = (id) => {
        let produkt = polozky.find(p => p.id === id);
        let polozka = { ...produkt };

        let noveId = 0;
        for (let i of kosik) {
            if (i.id >= noveId) {
                noveId = i.id;
            }
        }
        noveId += 1;
        polozka.id = noveId;

        nastavKosik([...kosik, polozka]);
    }

    const odebratZKosiku = (id) => {
        const novyKosik = [...kosik];

        let index = -1;
        for (let i = 0; i < novyKosik.length; i++) {
            if (novyKosik[i].id === id) {
                index = i;
                break;
            }
        }

        if (index !== -1) {
            novyKosik.splice(index, 1);
        }

        nastavKosik(novyKosik);
    }


    return (
        <BrowserRouter>
            <div>
                <Navigation />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/kosik" element={<Cart list={kosik} Remove={odebratZKosiku}/>} />
                    <Route path="/katalog" element={<Catalog list={polozky} Add={pridatDoKosiku}/>} />
                </Routes>
            </div>
        </BrowserRouter>
    );
}

export default App;
