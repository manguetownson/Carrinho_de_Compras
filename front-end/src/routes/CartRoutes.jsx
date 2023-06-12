import { Navigate, Route, Routes } from "react-router-dom"
import { CartView } from "../components/CartView"
import { CatalogView } from "../components/CatalogView"

export const CartRoutes = ({ handlerAddProductCart, handlerDeleteProductCart, cartItems }) => {
    return (
        <Routes>
            <Route
                path="catalog"
                element={<CatalogView handler={handlerAddProductCart} />}
            />

            <Route path="cart" element={(
                cartItems?.length <= 0 ?
                    <div className="alert alert-warning">Seu carrinho está vazio!</div>
                    :
                    (
                        <div className="my-4 w-50">
                            <CartView items={cartItems} handlerDelete={handlerDeleteProductCart} />
                        </div>
                    )
            )} />

            <Route path="/" element={<Navigate to={'/catalog'} />} />

        </Routes>
    )
}