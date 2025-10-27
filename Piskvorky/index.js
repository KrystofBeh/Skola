window.onload = () => {
    const board = document.getElementById('board');
    const message = document.getElementById('win');
    const resetBtn = document.getElementById('reset');
    let current = 'X';
    let cells = [];
    let gameOver = false;
    const cellElements = [];

    for (let i = 0; i < 9; i++) {
        const cell = document.createElement('div');
        cell.className = 'cell';
        cell.addEventListener('click', () => move(cell, i));
        board.appendChild(cell);
        cells[i] = '';
        cellElements.push(cell);
    }

    function move(cell, index) {
        if (cell.textContent || gameOver) return;
        cell.textContent = current;
        cells[index] = current;
        if (checkWin(current)) {
            message.textContent =  "Vyhrál hráč " + current ;
            gameOver = true;
        } else {
            current = current === 'X' ? 'O' : 'X';
        }
    }

    function checkWin(player) {
        const winCombos = [
            [0,1,2],[3,4,5],[6,7,8],
            [0,3,6],[1,4,7],[2,5,8],
            [0,4,8],[2,4,6]
        ];
        return winCombos.some(combo =>
            combo.every(i => cells[i] === player)
        );
    }

    resetBtn.addEventListener('click', () => {
        cellElements.forEach(cell => cell.textContent = '');
        cells = Array(9).fill('');
        gameOver = false;
        current = 'X';
        message.textContent = '';
    });
}

