# cmd - pip install numpy
# pip install matplotlib

# as = alias
import numpy as np
# numpy : 수학
import matplotlib.pyplot as plt
# matplotlib : 화면에 보여주는 얘

if __name__ == "__main__":
    x = np.arange(0, 10)
    y = x
    
    plt.plot(x, y)
    plt.show()

x = np.linspace(0, 1, 50)

y1 = np.cos(4 * np.pi * x)
y2 = np.cos(4 * np.pi * x) * np.exp(-2 * x)

fig, ax = plt.subplots(2, 1)

ax[0].plot(x, y1, 'r-*', lw = 1)
ax[0].grid(True)
ax[0].set_ylabel(r'$sin(4 \ pi x)$')
ax[0].axis([0, 1, -1.5, 1.5])

ax[1].plot(x, y2, 'b--o', lw = 1)
ax[1].grid(True)
ax[1].set_xlabel('x')
ax[1].set_ylabel('r$ e^{-2x} sin(4 \ pi x) $')
ax[1].axis([0, 1, -1.5, 1.5])

plt.tight_layout()
plt.show()








